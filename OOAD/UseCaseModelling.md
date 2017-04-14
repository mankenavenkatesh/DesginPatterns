USE CASES AND MODELLING.

What is Use Case?
1. An Activity that the system performs, usually in response to a request by user.
2. Use cases define functional requirements. (Functional Decomposition)

How to identify Use Cases?
1. User Goal Technique.(Used for small scale applications)
	1. Identify all the users(including dependent systems).
	2. Classify all users into functional roles.(shipping, marketing etc)
	3. Classify all users into organizational level.(operations, executive, professional etc)
	4. Interview to find a list of specific goals. 
		1. User verb-noun phrasing. (Add Customer, Update order, Product report)
	5. Create use case list organized by user type.
	6. Look for duplicate use cases and resolve inconsistencies.
	7. Identify where different types of users need the same use cases.
	8. Review all use cases with each type of user and the stakeholders.
		
2. Event Decomposition Technique.(frequently used)
	1. Identify events that occur to which system must respond.
	2. For each event, name a use case (verb-noun) that describes what system does when event occurs.
	Events - 
		1. External Event - an event that occurs outside the system. usually initiated by an external agent or actor.
		2. Temporal Event - an event that occurs as a result of reaching a point in time.
		3. State Event - an event that occurs when something happens inside the system that triggers some process.
	Example Events:	
		1. update customer (External Event)
		2. Every day at noon, generate reports (Temporal)
		3. Reorder point is reached for inventory item (State)
	How to find these events?
		1. Understand the life cycle of customer in the system.
		2. what actions customer will do with the system.
	Perfect Technology Assumption
		1. Don't worry about common things for all the systems like login, changepassword etc
	Steps
		1. Consider the external events that require a response by system. 
		2. For each external event, identify and name the use case(verb-noun) that system requires. 
		3. Consider the temporal events that require a response by system.
		4. for each temporal event, identify and name the use case.
		5. Consider the state events that require a response by system.
		6. for each state event, identify and name the use case.
		7. Perfect technology assumptions.
		
Final consideration is the CRUD in use case analysis. For each domain class, identify all use cases for CRUD.
	Steps
		1. Identify all the entities or domain classes involved in the new system
		2. For each entity, use case for CRUD 
		3. with integrated applications, make sure it is clear which application is responsible for CRUD.



USE CASE DESCRIPTION
1. once you have your use cases, provide a list with brief description DESCRIBING THE BASIC STEPS TO COMPLETE USE CASE.
2. EXAMPLE: 
	1. Create customer account
		User enters customer account data, and the system assigns customer account number, created a customer record and creates an account record.
	2. Look up customer.
		User enters customer account number, and the system retrieves and displays customer and account data.

USE CASE DIAGRAM		
1. A UML model to graphically show use cases and their relationships to actors.
2. Actor is the UML name for an end user who interacts with system.
3. Automation boundary

		
		
				
		
