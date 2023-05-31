Damjan Boshkovski, 215048

Control Flow Graph
![CFG](./graph.cfg)

Цикломатска комплексност
Цикломатската комплексност на овој код е 5, тој број го добив преку формулата V = E - N + 2P, каде што E (20) е бројот на рабови, N (17) е бројот на јазли, а P (1) е бројот на предикатни јазли,

Напишете ги сите тест случаи според Every Branch критериумот. Напишете и
објаснете ги тест случаите во документацијата
1. name = true, password = true, email = true
   Output: true
2. name = null, password = true, email = true
   email should be set as username
3. name = true, password = null, email = true
   output = RuntimeException("Mandatory information missing!")
4. name = true, password = true, email = null
   output = RuntimeException("Mandatory information missing!")
5. name = true, password = true, email = true
   if an existing user has the same email as the newly entered user
   output = false
6. name = true, password = true, email = true
   if an existing user has the same username as the newly entered user
   output = false
7. name = true, password = true, email = true
   if the password contains the username.
   output = false
8. name = true, password = true, email = true
   if the password has less than 8 characters
   output = false
9. name = true, password = true, email = true
   if the password contains special character and meets all requirements
   output = true

Напишете ги сите тест случаи според Multiple Condition критериумот за условот
if (user==null || user.getPassword()==null || user.getEmail()==null). Напишете и
објаснете ги тест случаите во документацијата.

1. user == null, user.getPassword()== Doesnt matter, user.getEmail() == Doesnt matter
   throw new RuntimeException("Mandatory information missing!")
2. user != null, user.getPassword()!= null, user.getEmail() == Doesnt matter
   throw new RuntimeException("Mandatory information missing!")
2. user != null, user.getPassword()!= null, user.getEmail() != null
   no exception
3. user != null, user.getPassword()== null, user.getEmail() == Doesnt matter
   throw new RuntimeException("Mandatory information missing!")

