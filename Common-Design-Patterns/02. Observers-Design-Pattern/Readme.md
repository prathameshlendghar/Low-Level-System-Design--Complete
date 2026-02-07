# Observer Design Pattern

1. Whenever change in the State/Variable of Object occurs, it should auto-trigger/call the method performing some action.

**Example:** 
- If there is a `Youtube_channel` class, and each individual channel is Object of this class.
- There is a `Subscriber` class and each subscriber is the object of this subscriber class.
- Now whenever the `Youtube_channel` is updated with the new YouTube Activity(Video, Post, etc.) then each subscriber has to be notified.

## How can we implement this:

### Naive Approach -- Subscribers Polling for changes

Basically Subscribers would rely on a poll_updates() and this will have a infinite loop running where it will ask for the update every **millisecond/Time-defined**

#### Why it is not a good idea
1. The number of `Subscriber` objects will increase rapidly and if all of them poll for changes continuously they will overwhelm  the `Youtube_channel`
2. To make the Polling from Subscriber & other functionalities to run simultaneously we need a multithreading approach, Each Subscriber will need separate thread.
3. What if the `subscriber` needs to subscribe multiple `Youtube_channel`, There will be a lot of work.


### Better Approach -- Youtube_channel pushing notification to the subscriber.

1. We have `Youtube_channel` class and `Subscriber` class
2. Now `Youtube_channel` will have list of `Subscriber` objects.
3. Whenever new changes are introduced to `Youtube_channel` object all its associated Subscribers will get notified.

![img.png](images/img.png)

#### Why it is not a good idea
1. Tight Coupling between `Youtube_channel` and `Subscriber` both concrete implementation. **Violating DIP**. 
2. If youtube_channel needs to notify any `gmail_subscriber` in future, then it will not work as it is hard coded to `Subscriber`.
3. `Subscriber` has rigid update method, There will be multiple types of subscriber like (All notification update, Only videos, videos & reels, etc).

#### We are not following
1. OCP (Open Closed Principle)
2. DIP (Dependency Inversion Principle)

### Observers Design Pattern: Refining the approach 
![img_2.png](images/img_2.png)

### In Observer Design pattern there are two ways to implement
1. **Push based Update:** 
   * Observable calls the `update(param1, ... , paramN)` of all the observers with all the params that observable have.
       This leads to sometimes providing the extra info to the observer when it is not needed.

2. **Pull based Update:** 
   * Here the Observable calls the `update()` but without params, basically it is just the blank notification saying "_some change happened at observable_"
   * Now it's observer's `update()` job to fetch the required fields from the observable object, using the `getters()`

#### Why it is a better way of implementation:
1. No interface is dependent on the implementation **(Following DIP)**. Interface gives a generalized view and acts as a kind of contract for all the subclasses of same type. 
2. If we want a new type of subscriber we can add new Observer concrete class without changing existing ones **(Following OCP)**
3. We have loosely Coupled Design

