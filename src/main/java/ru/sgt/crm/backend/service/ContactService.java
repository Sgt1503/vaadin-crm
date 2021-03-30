package ru.sgt.crm.backend.service;

import ru.sgt.crm.backend.entity.Company;
import ru.sgt.crm.backend.entity.Contact;
import ru.sgt.crm.backend.repository.CompanyRepository;
import ru.sgt.crm.backend.repository.ContactRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ContactService {
    private static final Logger LOGGER = Logger.getLogger(ContactService.class.getName());
    private ContactRepository contactRepository;
    private CompanyRepository companyRepository;

    public ContactService(ContactRepository contactRepository,
        CompanyRepository companyRepository) {
        this.contactRepository = contactRepository;
        this.companyRepository = companyRepository;
    }

    public List<Contact> findAll(String stringFilter) {
        if (stringFilter == null || stringFilter.isEmpty()) {
            return contactRepository.findAll();
        } else {
            return contactRepository.search(stringFilter);
        }
    }

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public long count() {
        return contactRepository.count();
    }

    public void delete(Contact contact) {
        contactRepository.delete(contact);
    }

    public void save(Contact contact) {
        if (contact == null) {
            LOGGER.log(Level.SEVERE,
                "Contact is null. Are you sure you have connected your form to the application?");
            return;
        }
        contactRepository.save(contact);
    }
    @PostConstruct
    public void populateTestData() {
        if (companyRepository.count() == 0) {
            companyRepository.saveAll(
                Stream.of("Клиент", "Работник", "Менеджер")
                    .map(Company::new)
                    .collect(Collectors.toList()));
        }

        if (contactRepository.count() == 0) {
            Random r = new Random(0);
            List<Company> companies = companyRepository.findAll();
            contactRepository.saveAll(
                Stream.of("Роман Иванов", "Иван Романов", "Эдуард Петров",
                    "Петр Колобков", "Вася Пупкин", "Аслан Дзантиев", "Эмилия Ремонтова", "Красулла Овальная",
                    "Павел Игорин", "Игорь Музыка", "Райан Гослинг", "Петр Михайлов", "Олег Рюриков",
                    "Илон Маск", "Товарищ Сталин", "Имя Непридумал", "Дарья Клебанова", "Уилл Смитт",
                    "Михаил Редуктор", "Доджа Кэт", "Джастин Бибер", "Егор Егоров", "Лора Палмер",
                    "Лена Кука", "Реми Крыса", "Рональд Рейган", "Элвис Пресли", "Егор Летов",
                    "Джулс Трансова", "Нурлан Сабуров")
                    .map(name -> {
                        String[] split = name.split(" ");
                        Contact contact = new Contact();
                        contact.setFirstName(split[0]);
                        contact.setLastName(split[1]);
                        contact.setCompany(companies.get(r.nextInt(companies.size())));
                        contact.setStatus(Contact.Status.values()[r.nextInt(Contact.Status.values().length)]);
                        String email = (contact.getFirstName() + "." + contact.getLastName() + "@" + "почта" + ".ру").toLowerCase();
                        contact.setEmail(email);
                        return contact;
                    }).collect(Collectors.toList()));
        }
    }
}