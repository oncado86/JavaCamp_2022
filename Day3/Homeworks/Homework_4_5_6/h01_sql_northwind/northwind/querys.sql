--comment line
SELECT * FROM Customers -- All customer data is fetched from the customer table.
SELECT ContactName, City FROM Customers -- The ContactName and City data are fetched from the customer table.
SELECT ContactName AS Adi, City AS Sehir FROM Customers -- It is retrieved from the customer table with the aliases ContactName 'Adi' and City 'Sehir'.
SELECT * FROM Customers WHERE City = 'London' -- Retrieve customers from the 'Customers' table with the city information 'London'.

--! SQL is case insensitive
select * from products
select * from products where categoryId = 1 -- Returns products with category id = 1
select * from products where categoryId = 1 or categoryId = 3 -- Returns products with category id =1 or categoryId = 3
select * from products where categoryId = 1 and price >= 10 --Retrieve products with category id =1 and unitPrice>= 10. >= is meaning > and =
select * from products where categoryId = 1 and price <> 10 --Retrieve products with category id =1 and unitPrice <> 10. <> is meaning different
select * from products order by productName -- All products are brought in order according to the product name.
select * from products order by categoryId, productName
select * from products order by price -- asc ascending (default), desc descending
select * from products order by price desc --All products come by product name and with decreasing price 
select * from products where categoryID = 1 order by price desc
select count(*) from products -- Number of entries in the product table (number of products)
select count(*) from products where categoryID = 1 --Number of products with category id 1
select categoryID, count(*) from products group by categoryID -- Number of products in each category
select categoryID, count(*) from products group by category having count(*) < 10 -- Brings the categories with less than 10 products from the products table with the number of products

-- Group the products with a price of more than 20 according to the category id, 
-- and bring those with less than 10 in each group.
select categoryID, count(*) from products
where price > 20
group by categoryID having count(*) < 10


-- Brings products with a price greater than 10, together with their category names.
select products.productID, products.productName, products.price, categories.categoryName
from products inner join categories
on products.categoryID = categories.categoryID
where products.price > 10


-- 'inner join' joins the tables if there is a match in both tables.
select * from products as p inner join orderDetails as od 
on p.productID = od.productID

select * from products as p inner join orderDetails as od 
on p.productID = od.productID
inner join orders as o
on o.orderID = od.orderID

-- Bring those on the 'left' and those not on the 'right'!
-- 'p' and 'od' alias
select * from customers as c left join orders as o
on c.customerId = o.customerId
where o.customerId is null

