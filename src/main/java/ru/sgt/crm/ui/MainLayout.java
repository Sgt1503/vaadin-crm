package ru.sgt.crm.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;
import ru.sgt.crm.ui.view.ListView;
import ru.sgt.crm.ui.view.MainView;

@CssImport("./styles/shared-styles.css")
public class MainLayout extends AppLayout {
    public MainLayout() {
        createHeader();
    }

    private void createHeader() {
        H1 logo = new H1("KimPub");
        logo.addClassName("logo");


        Anchor crm = new Anchor("crm", "CRM");
        Anchor logout = new Anchor("logout", "Выйти");
        Anchor main = new Anchor("", "Главная");



        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo, main, crm, logout);

        header.expand(logo);
        header.setDefaultVerticalComponentAlignment(
            FlexComponent.Alignment.CENTER);
        header.setWidth("100%");
        header.addClassName("header");


        addToNavbar(header);

    }
}