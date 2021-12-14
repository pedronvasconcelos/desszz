package com.javaseleniumtemplate.pages;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ManageProjectPage extends PageBase{

    //Mapping ManageProjects
    By createNewProjectBtn = By.xpath("//button[@class='btn btn-primary btn-white btn-round']");
    By projectNameField = By.id("project-name");
    By statusComboBox = By.id("project-status");
    By descriptionField = By.id("project-description");
    By addProjectBtn = By.xpath("//input[@value='Add Project']");
    By sucessText = By.xpath("//p[@class='bold bigger-110']");
    By categoryAddField = By.xpath("//*[@class='input-sm']");
    By addCategoryBtn = By.xpath("//input[@value='Add Category']");
    By proccedButton = By.xpath("//a[@class='btn btn-primary btn-white btn-round ']");
    By viewStatusCombobox = By.id("project-view-state");
    By createNewSubprojectButton = By.xpath("//button[contains(text(),'Create New Subproject')]");
    By versionField = By.name("version");
    By addVersionButton = By.name("add_version");




    //Actions
    public void clickCreateNewProject(){
        click(createNewProjectBtn);
    }

    public void fillProjectName(String projectName){
        sendKeys(projectNameField, projectName);
    }

    public void selectViewStatus(String status){
        comboBoxSelectByVisibleText(viewStatusCombobox, status);
    }

    public void fillDescription(String description){
        sendKeys(descriptionField, description);
    }

    public void clickAddProject(){
        click(addProjectBtn);
    }

    public String returnSucessText(){
        return getText(sucessText);
    }

    public void fillCategoryAdd(String categoryName){
        sendKeys(categoryAddField, categoryName);
    }

    public void clickAddCategory(){
        click(addCategoryBtn);
    }

    public String returnCreatedCategory(String category){
        By categoryName = By.xpath("//td[text()='" + category + "']");
        return getText(categoryName);
    }

    public void clickProceed(){
        click(proccedButton);
    }

    public String getProjectName(String project){
        By projectLink = By.linkText(project);
        return getText(projectLink);
    }

    public void clickProjectLink(String project){
        By projectLink = By.linkText(project);
        click(projectLink);
    }

    public void clickNewSubProject(){
        click(createNewSubprojectButton);
    }

    public void fillVersion(String version){
        sendKeys(versionField, version);
    }

    public void clickAddVersion(){
        click(addVersionButton);
    }

}
