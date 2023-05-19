## الگوی Facade

اولین پیاده‌سازی این الگو را در پکیج `parser` انجام می‌دهیم. به این صورت که به جای اینکه به صورت مستقیم آبکجت ‍`Parser` را بسازیم و متد `startParse` را صدا بزنیم،‌ از فساد این پکیج استفاده می‌کنیم:


<img width="1324" alt="Screenshot 1402-02-29 at 6 06 57 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/97f39224-c93f-456a-90dd-b89fce5693e5">


دومین تغییر با توجه به این الگو در پکیج `codeGenerator` انجام شده‌است. در این پکیح نیز یک کلاس فساد تعریف کرده تا به عنوان رابطی برای استفاده از ویژگی‌های این پکیج در پکیج‌های دیگر باشد:

<img width="1322" alt="Screenshot 1402-02-29 at 6 11 43 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/4a7c437c-eafb-47bd-a980-9777386acda4">

<img width="1314" alt="Screenshot 1402-02-29 at 6 12 05 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/b4a2de6b-8231-4842-851a-6eeb294e37b4">


## استفاده از Polymorphism

استفاده از switch در کد زیر باعث بوی بد کد می‌شود و maintanance را پایین می‌آورد. به جای اینکه از یک enum به عنوان TypeAddress اسقفاده کنیم، بهتر است که یک کلاس ‍‍`TypeAddress` داشته‌باشیم که کلاس‌های متناظر از آن ارث‌بری می‌کنند.

<img width="1307" alt="Screenshot 1402-02-29 at 6 14 03 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/927f0101-393d-449f-b108-b67c59587b74">


برای این کار `TypeAddress` را به شکل زیر تغییر می‌دهیم:

<img width="1323" alt="Screenshot 1402-02-29 at 6 16 59 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/b6031563-3369-49dc-acab-b2f59a8e46c4">

و کلاس‌های زیر را تعریف می‌کنیم:

<img width="1325" alt="Screenshot 1402-02-29 at 6 17 15 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/2bef1d0c-420c-4ca6-934f-a0b91d16dc48">

همچنین، بخش‌هایی از کد را به نیاز به تغییر سینتکس دارند را به شکل زیر تغییر می‌دهیم:

<img width="1328" alt="Screenshot 1402-02-29 at 6 18 20 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/3f779695-d590-4178-8b71-a5c5031fda5d">

<img width="1323" alt="Screenshot 1402-02-29 at 6 18 39 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/d54a3984-1330-4a13-bf59-f7bba52e6742">

## تکنیک Method Extraction

در اینجا بخشی از کد را که دوبار تکرار شده‌است (duplicate code) را به صورت یک متد جداگانه تعریف کرده و به جای نوشتن دوباره‌ی کد، این متد را قراخوانی می‌کنیم:

<img width="1623" alt="Screenshot 1402-02-29 at 6 22 59 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/3900d5b5-657b-4d29-8af5-7308fb786fa4">


## تکنیک Replace temp with Query

در این جا به جای اینکه هر بار یک عملیات محاسبه را بنویسیم، یک متغیر موقتی تعریف می‌کنیم و این مقدار محاسبه‌شده را در آن می‌ریزیم تا از تکرار کد جلوگیری کنیم:

<img width="1651" alt="Screenshot 1402-02-29 at 6 24 05 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/619ad27f-843f-4d98-8b09-26ef48baeb79">


## تکنیک Inlne Temp

در این جا به جای به استفاده از یک متغیر موقتی که تنها یک بار از آن استفاده شده، به طور مستقیم از آن مقدار در کد خود استفاده می‌کنیم:

<img width="1642" alt="Screenshot 1402-02-29 at 6 25 47 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/08340088-b74f-4718-9d9f-04c78a5e53aa">



