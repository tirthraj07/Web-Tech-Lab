## Assignment 10
By Tirthraj Mahajan
Roll No: 31242

Problem Statement  
Design and implement the web application logic for deposit and withdraw amount transaction using EJB

### How to run

```bash
mvn clean package
```

Run the embedded Tomcat server
```bash
mvn tomee-embedded:run 
```

Here's the output:   

**Deposit 10k in account**  
![](output1.png)

**Success page:**   
![](output2.png)
---
**Withdraw 5k from account**   
![](output3.png)

**Success page:**  
![](output4.png)
---
**Withdraw 1000000 from account**
![](output5.png)

**Insufficient Funds error**   
![](output6.png)
