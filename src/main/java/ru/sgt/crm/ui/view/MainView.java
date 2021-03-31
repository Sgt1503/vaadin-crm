package ru.sgt.crm.ui.view;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.sgt.crm.ui.MainLayout;


@Route(value="", layout = MainLayout.class)
@CssImport("./styles/shared-styles.css")
public class MainView extends VerticalLayout {
    Pibimpub pibimpub = new Pibimpub();
    Gopchang gopchang = new Gopchang();
    Kadury kadury = new Kadury();
    Pulkoge pulkoge = new Pulkoge();
    Sushi sushi = new Sushi();
    KimchiRice kimchiRice = new KimchiRice();


    public MainView() throws InterruptedException {
        HorizontalLayout content1 = new HorizontalLayout();
        HorizontalLayout content2 = new HorizontalLayout();


        Div div1 = new Div();
        Div div2 = new Div();
        Div div3 = new Div();
        Div div4 = new Div();
        Div div5 = new Div();
        Div div6 = new Div();
        addClassName("main-view");


        H4 nameKimchiRice= new H4(kimchiRice.getName());
        H4 namePulkoge = new H4(pulkoge.getName());
        H4 namePibimpub = new H4(pibimpub.getName());
        H4 nameGopchang = new H4("Гопчанг");
        H4 nameKadury = new H4("Кадури");
        H4 nameSushi = new H4("Корейские Суши");

        nameKimchiRice.setClassName("h4");
        namePibimpub.setClassName("h4");
        namePulkoge.setClassName("h4");
        nameGopchang.setClassName("h4");
        nameKadury.setClassName("h4");
        nameSushi.setClassName("h4");

        kimchiRice.getImage().setClassName("img");
        pibimpub.getImage().setClassName("img");
        pulkoge.getImage().setClassName("img");
        gopchang.getImage().setClassName("img");
        kadury.getImage().setClassName("img");
        sushi.getImage().setClassName("img");



        div1.add(pibimpub.getImage());
        div1.add(namePibimpub);
        div2.add(kimchiRice.getImage());
        div2.add(nameKimchiRice);
        div3.add(pulkoge.getImage());
        div3.add(namePulkoge);
        div4.add(gopchang.getImage());
        div4.add(nameGopchang);
        div5.add(kadury.getImage());
        div5.add(nameKadury);
        div6.add(sushi.getImage());
        div6.add(nameSushi);
        content1.add(div1,div2,div3);


        div1.setClassName("wrapper padded-container");
        div2.setClassName("wrapper padded-container");
        div3.setClassName("wrapper padded-container");
        div4.setClassName("wrapper padded-container");
        div5.setClassName("wrapper padded-container");
        div6.setClassName("wrapper padded-container");
        content2.add(div4,div5,div6);

        content1.setClassName("content");
        content2.setClassName("content");
        descNotif(pulkoge);
        descNotif(sushi);
        descNotif(pibimpub);
        descNotif(kimchiRice);
        descNotif(kadury);
        descNotif(gopchang);
        add(content1,content2);
    }
    public void descNotif(descrptAndImg descrptAndImg){
        VerticalLayout decrpt = new VerticalLayout();
        decrpt.add(descrptAndImg.getDescription());
        NativeButton buttonInside = new NativeButton("Добавить в корзину");
        Notification descrptNotification = new Notification(decrpt, buttonInside);
        descrptNotification.setDuration(30000);
        buttonInside.addClickListener(event -> descrptNotification.close());
        descrptNotification.setPosition(Notification.Position.MIDDLE);
        descrptAndImg.getImage().addClickListener(e -> descrptNotification.open());
    }
}
