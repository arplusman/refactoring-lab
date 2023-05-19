## الگوی Facade

اولین پیاده‌سازی این الگو را در پکیج `parser` انجام می‌دهیم. به این صورت که به جای اینکه به صورت مستقیم آبکجت ‍`Parser` را بسازیم و متد `startParse` را صدا بزنیم،‌ از فساد این پکیج استفاده می‌کنیم:


<img width="1324" alt="Screenshot 1402-02-29 at 6 06 57 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/97f39224-c93f-456a-90dd-b89fce5693e5">


دومین تغییر با توجه به این الگو در پکیج `codeGenerator` انجام شده‌است. در این پکیح نیز یک کلاس فساد تعریف کرده تا به عنوان رابطی برای استفاده از ویژگی‌های این پکیج در پکیج‌های دیگر باشد:

<img width="1322" alt="Screenshot 1402-02-29 at 6 11 43 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/4a7c437c-eafb-47bd-a980-9777386acda4">

<img width="1314" alt="Screenshot 1402-02-29 at 6 12 05 PM" src="https://github.com/arplusman/refactoring-lab/assets/45389988/b4a2de6b-8231-4842-851a-6eeb294e37b4">

