/**
 * Created by chm on 4/11/16.
 */

/**********  prototype  ***********/
//console.log("填写内容让下面代码支持a.name = 'name1'; b.name = 'name2';");
//function obj(name) {
////注意在js中undefined不等于"",不要设置为判断name是否为空.在判断时类型转换可以将undefined隐式转换成false
//  if(name) {
//      this.name = name;
//  }
////一定要return this,因为定义a变量的时候没有用关键字new,这样不会默认this指向新建的对象并且返回.
//    return this;
//}
//
//obj.prototype.name = "name2";
//
//var a = obj("name1");
//var b = new obj;
//
//console.log("a.name = " + a.name + ";;b.name = " + b.name);


/************* closure **************/
//console.log("//由于被子函数调用,故父函数结束工作时变量仍然可以访问.");
//function demo1(){
//    var a = 1;
//    return function subdemo1(){
//        a++;
//        return a;
//    }
//}
//
//var td1 = demo1();
//var td2 = demo1();  //demo1执行一次创建一个执行环境,执行完成后立即销毁.故td1与td2指向的demo1的活动对象不是同一个,是独立的.
//console.log("td1() = " + td1());
//console.log("td2() = " + td2());
//


/*************closure imitate block scope(块作用域/私有作用域)*******************/
//(function(){
//      var a = 0;
//      console.log("1---a = " + a);
//    }
//)();

//console.log("2---a = " + a);   //error: a is undefined


/**************私有变量_通过构造函数定义特权方法**************************/
//function myobject() {
//
//    //私有变量和私有函数
//    var privateVarible = 10;
//
//    function privateFunction() {
//      return false;
//    }
//    this.publicMethod = function(){
//        privateVarible++;
//        console.log("privateVarible = " + privateVarible);
//        return privateFunction();
//    }
//}
//
//var o = new myobject();
//o.publicMethod();


/**************静态私有变量_通过私有作用域定义特权方法(实现:构造函数+原型--原型模式)********************/
//静态私有变量和私有变量区别在于静态私有变量是实例共享的

//(function(){
//       var name = "";
//
//       //初始化一个未经声明的变量,总会创建一个全局变量.在严格模式下,给未经声明的变量赋值会导致错误.
//       Person = function(){
//       };
//
//       Person.prototype.getName = function(){
//           return name;
//       }
//
//       Person.prototype.setName = function(value){
//           name = value;
//       }
//})();
//
//var p = new Person();
//console.log("p.name = " + p.getName());
//p.setName("chm");
//console.log("2 p.name = " + p.getName());

/*****************模块模式_为单例创建私有变量和特权方法********************/
//var singleton = (function(){
//    var privateVariable = 10;
//
//    function privateFunction(){
//        return false;
//    }
//
//    return {
//        pubVariable:privateVariable,
//        pubFunction:function(){
//            privateVariable++;
//            console.log(privateVariable);
//            return privateFunction();
//        },
//        getFunction:function(){
//            console.log("privateVariable = " + privateVariable);
//        }
//    }
//})();
//
////匿名函数只执行一次,pubVariable在执行时被赋予初始值
//console.log("pubVariable = " + singleton.pubVariable);
//singleton.pubFunction();
//singleton.pubFunction();
//singleton.pubFunction();
//singleton.pubFunction();
//singleton.pubFunction();
//singleton.getFunction();
//console.log("pubVariable = " + singleton.pubVariable);

/*************增强的模块模式_为特定类型单例创建私有变量和特权方法***********/
    var Base = function(){
};

var singleton = (function(){
    var privateVariable = 10;

    function privateFunction(){
        return false;
    }

    var object = new Base();

    object.publicVariable = 12;

    object.getPrivate = function(){
        privateVariable++;
        return privateFunction();
    };

    return object;
})();

console.log(singleton.getPrivate());