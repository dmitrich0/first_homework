# first_homework
PasswordConstraint: аннотация для валидации пароля, валидирует параметр метода, выводит ошибку "Password must contain at least 8 characters, '$' and '_'"
![image](https://user-images.githubusercontent.com/88574169/228293473-b385a02c-450f-4a78-b6a6-b60b4df48b9e.png)
PasswordValidator: класс, к которому обращается аннотация для валидации пароля, проверяет на длину и содержание некоторых символов в строке
![image](https://user-images.githubusercontent.com/88574169/228293821-32b69484-30b5-409d-911b-8b59dc4958ad.png)
CombinedConstraint: аннотация для валидации, объединяющая в себе валидацию по длине строки и по соответствию паттерну email-а одновременно
![image](https://user-images.githubusercontent.com/88574169/228294045-0ec082e0-53b3-4e6c-8097-360ab3b1df01.png)
Controller: чисто символический контроллер для проверки обеих валидаций
![image](https://user-images.githubusercontent.com/88574169/228294194-fdf2a099-689e-4dc3-b711-be7f2fc48a92.png)
ConstraintAdvice: обработчик ошибок валидации
![image](https://user-images.githubusercontent.com/88574169/228294405-906e5067-0d56-400d-b1fc-8288f59e1b63.png)
