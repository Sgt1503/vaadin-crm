package ru.sgt.crm.ui.view;

import com.vaadin.flow.component.html.Image;

/**
 * todo Document type descrptAndImg
 */
public class descrptAndImg{
    private Image image;
    private String name;
    private String description;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
    class Pibimpub extends descrptAndImg {
        private Image image = new Image("https://cdn.pixabay.com/photo/2017/08/08/09/44/food-photography-2610863_1280.jpg", "Пибимпаб");
        private String description = "Отварной рис с говядиной, яйцом, грибами и овощами " +
            "( шпинат, соевые бобы, кабачки, папоротник, морковь, ким). " +
            "   Подается в холодном виде с супом из морепродуктов и острым соусом.";
        private String name = "Пибимпаб";

        public String getName() {
            return name;
        }

        public Image getImage() {
            return image;
        }

        public String getDescription() {
            return description;
        }
    }

    class Gopchang extends descrptAndImg {
        private Image image = new Image("https://cdn.pixabay.com/photo/2019/11/21/18/28/gopchang-4643143_1280.jpg", "Гопчанг");

        private String description = "Жареные кусочки курицы в кляре в остро-сладком соусе. Посыпается кедровыми орешками.";
        private String name = "Гопчанг";

        public String getName() {
            return name;
        }

        public Image getImage() {
            return image;
        }

        public String getDescription() {
            return description;
        }
    }

    class KimchiRice extends descrptAndImg {
        Image image = new Image("https://cdn.pixabay.com/photo/2014/01/09/10/14/kimchi-fried-rice-241051_1280.jpg", "Кимчи Жаренный Рис");
        private String description =
            "Жареный рис с говядиной и овощами (кабачки, морковь, лук, яйцо, семена кунжута). К блюду подается суп из морских водорослей.";
        private String name = "Кимчи Жаренный Рис";

        public String getName() {
            return name;
        }

        public Image getImage() {
            return image;
        }

        public String getDescription() {
            return description;
        }
    }

    class Pulkoge extends descrptAndImg {
        private Image image = new Image("https://cdn.pixabay.com/photo/2017/07/19/03/13/pot-2517765_1280.jpg", "Пульгоге");
        private String description = "Маринованная говядина на гриле в сладком грушевом соусе и овощами ( болгарский перец, морковь, репчатый лук).";
        private String name = "Пулькоге";

        public String getName() {
            return name;
        }

        public Image getImage() {
            return image;
        }

        public String getDescription() {
            return description;
        }
    }

    class Kadury extends descrptAndImg {
        private Image image = new Image("https://cdn.pixabay.com/photo/2019/02/19/12/41/kaduri-4006749_1280.jpg", "Кадюри");

        private String description =
            "Корейский хворост кадюри – это нежное, воздушное лакомство, которое буквально тает во рту и одинаково нравится детям и взрослым.";
        private String name = "Кудюри";

        public String getName() {
            return name;
        }

        public Image getImage() {
            return image;
        }

        public String getDescription() {
            return description;
        }
    }

    class Sushi extends descrptAndImg {
        private Image image = new Image("https://cdn.pixabay.com/photo/2017/08/08/09/44/food-photography-2610864_1280.jpg", "Корейские суши");

        private String description = "Уже привычные японские роллы, с непривычными корейскими начинками!";
        private String name = "Суши";

        public String getName() {
            return name;
        }

        public Image getImage() {
            return image;
        }

        public  String getDescription() {
            return description;
        }
    }
