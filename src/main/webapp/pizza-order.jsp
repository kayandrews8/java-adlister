<%--
  Created by IntelliJ IDEA.
  User: kaylah_a
  Date: 4/27/22
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Order</title>
</head>
<body>
    <form method="post">
        <label for="crust">Choose your crust:</label>
        <select id="crust" name="crust">
            <option value="thin">Thin</option>
            <option value="hand-tossed">Hand Tossed</option>
            <option value="stuffed">Stuffed</option>
        </select><br>
        <label for="sauce">Choose your sauce</label>
        <select id="sauce" name="sauce">
            <option value="tomato">Tomato Sauce</option>
            <option value="alfredo">Alfredo Sauce</option>
            <option value="buffalo">Buffalo Sauce</option>
            <option value="barbecue">Barbecue sauce</option>
        </select><br>
        <label for="size">Choose your size</label>
        <select id="size" name="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="extra-large">Extra Large</option>
        </select><br>
        <label for="toppings">Choose your toppings</label>
        <div id="toppings">
            <input type="checkbox" value="Pepperoni">Pepperoni
            <input type="checkbox" value="Extra Cheese">Extra Cheese
            <input type="checkbox" value="Pineapple">Pineapple
            <input type="checkbox" value="Chicken">Chicken
        </div><br>
        <label for="address">Enter your address:</label>
        <input type="text" id="address" name="address"><br>
        <button type="submit">Submit</button>
    </form>
  </body>
</html>
