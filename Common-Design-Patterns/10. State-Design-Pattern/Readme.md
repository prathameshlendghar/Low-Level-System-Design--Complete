# State Design Pattern

- Whenever we want the behavior of same object to act differently.
- Assume that the object can go into different states when we perform some actions on it.
- And in each state the object should behave accordingly, means the same actions call might vary when object in different state.

## Assume we are building the Vending machine like setup
![img.png](images/img.png)

### What are the core functionality of such vending machine
**It should allow user to:**
1. Insert product code to select product they want.
2. Proceed for payment
3. Process payment for the product.
4. Dispense the requested product.
5. Cancel the partial transaction, get refund if paid already.
6. After user receive the product the vending machine can accept the new requests.

**What if?**
1. Someone pay amount without giving product details.
2. Someone request new product during ongoing request processing (payment processing, dispense processing, etc).
3. Someone asks for refund of money after product is dispensed.
4. Someone ask for the product not available

![img_1.png](images/img_1.png)

## Arriving to the solutions

1. In the above diagram the actions denoted by Arrow are the actions that user request to machine.
2. Its machine responsibility to marks how the actions should respond, when performed after some set of request. i.e. at each state.
3. Now user is unaware of this states of the machine. User don't care about knowing at what state machine is.
4. They only want a valid actions to give valid response.
5. And Machine reliability depends on throwing errors if some action is done in unexpected order, (Breaking the flow of requests).

### Naive Approach
