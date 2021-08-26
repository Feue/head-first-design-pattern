### 观察者模式

在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，
依赖它的对象都会收到通知，并自动更新。

代表：MVC

Subject(主题) --> Observer(观察者)

主题数据改变，通知观察者。

Java内置观察者模式(java.util包下)：Observable(可观察者)、
Observer(观察者)。主题继承Observable类，观察者实现Observer接口。