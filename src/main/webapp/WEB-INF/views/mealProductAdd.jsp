<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Food Diary</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"
          rel="stylesheet">
    <link href='<c:url value="/resources/css/style.css"/>' rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
          integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</head>


<body>
<section class="dashboard-section">
    <div class="row dashboard-nowrap">


        <div class="m-4 p-3 width-medium">
            <div class="dashboard-content border-dashed p-3 m-4 view-height">
                <div class="row border-bottom border-3 p-1 m-1">
                    <div class="col noPadding">
                        <h3 class="color-header text-uppercase">DODAJ PRODUKT DO POSIŁKU</h3>
                    </div>
                    <form:form modelAttribute="product" method="post">
                    <div class="col d-flex justify-content-end mb-2 noPadding">
                        <button type="submit" class="btn btn-success rounded-0 pt-0 pb-0 pr-4 pl-4">Zapisz</button>
                    </div>
                </div>

                <div class="schedules-content">

                        <div class="form-group row">
                            <label for="name" class="col-sm-2 label-size col-form-label">
                                Nazwa
                            </label>
                            <div class="col-sm-10">
                                <form:input path="name" type="text" cssClass="form-control" id="name"
                                            placeholder="Nazwa"/>
                                <form:errors path="name" cssClass="error"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="weight" class="col-sm-2 label-size col-form-label">
                                Waga (g)
                            </label>
                            <div class="col-sm-2">
                                <form:input path="weight" type="number" class="form-control" id="wieght"
                                            placeholder="Waga (g)"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="weight" class="col-sm-2 label-size col-form-label">
                                Tłuszcz (na 100g)
                            </label>
                            <div class="col-sm-2">
                                <form:input path="fat" type="number" class="form-control" id="wieght"
                                            placeholder="Tłuszcz (g)"/>
                                <form:errors path="fat" cssClass="error"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="weight" class="col-sm-2 label-size col-form-label">
                                Białko (na 100g)
                            </label>
                            <div class="col-sm-2">
                                <form:input path="protein" type="number" class="form-control" id="wieght"
                                            placeholder="Białko (g)"/>
                                <form:errors path="protein" cssClass="error"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="weight" class="col-sm-2 label-size col-form-label">
                                Węglowodany (na 100g)
                            </label>
                            <div class="col-sm-2">
                                <form:input path="carbohydrates" type="number" class="form-control" id="wieght"
                                            placeholder="Węglowodany (g)"/>
                                <form:errors path="carbohydrates" cssClass="error"/>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>







