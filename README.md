# Food Diary

## Application description
Food Diary is a simple application to make a meal. Your job is make a meal (name, recipe, cuisine), after that you can add products to meal (is neccesery to state the quantity of macronutrents and weight), after that you can see full details of your meal include macronutrients and calories of meal.
Application could be very helpfull especially to people who counting callories to be fit and healthly.

## Used technologies
  * Java 11
  * Spring
  * Hibernate
  * MySQL
  * LOMBOK
  * JSP
  * HTML, CSS

## How to start
1. Create a fork of the repository.
2. Clone to your computer. 
3. Import project as a Maven project (e.g. in IntelliJ).

## Implemented functionalities
* Manage meals (add/delete/details/edit).
* Manage products in meal (add/delete).
* Automatically counting macronutrents and callories of meal after adding some products (main function of application)

## How to use it
To create a meal, I recommend following steps:
1. On the home page select the button "Lista posiłków"
2. On the meal list we can see some meals (sorted by name), because application contains a batch file with data to the database. You can delete or see details of one of meal which already exist.
3. Button "Dodaj posiłek" takes you to form where you can add new meal. After adding new meal you are redirect again to meal list.
4. When you select "Szczegóły" at the chosen meal, you'll see full details of the meal. Section "Wartości odżywcze" shows you full information about macronutrents and calories of whole meal, which is automatically updated after adding new products to meal, or deleted products from meal.
5. Select "Powrót" to go to meal list.
