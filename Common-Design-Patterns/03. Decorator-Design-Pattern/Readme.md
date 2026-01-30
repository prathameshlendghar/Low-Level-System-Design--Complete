# Decorator Design Pattern

1. When we want to stack functionality on top of existing functionalities dynamically at runtime
2. If the requirement is: to perform current operation we need the output from some other object.
3. This is similar to Recursion/Backtracking: To get final result the subproblems are solved individually and the results are pilled up to get the final result.

[//]: # (Example: )

[//]: # (- In the Amazon like E-commerce where the calculation of cart is on the basis of various factors)

[//]: # (1. If customer is prime member there should be free-delivery)

[//]: # (2. If customer has coupon-code then discount need to be calculated.)

[//]: # (3. If the cart total is above some amount no delivery charge)

[//]: # (4. If customer has scratch card then cashback is given if order is placed successfully)

[//]: # ()
[//]: # (Now these all things are conditional for each customer, and based on customer & order eligibility there can be various combination of calculation is possible.)

[//]: # ()
