///**
// * Created by chm on 12/8/15.
// */
//(function(){
//    function func1(){
//       this.param1 = "func1_param1";
//        this.param2 = "func1_param2";
//    }
//
//    function func2(){
//        document.write("I am the second funcction" +"<br>");
//        var test = new func1();
//        document.write("func2 write func1.param1 " + test.param1 +"<br>");
//    }
//
//    function func3(){
//        document.write("I am the third funcction"+"<br>");
//        func2();
//    }
//
//    window.onload = func3();
//
//}).call(this);

var Class={
     create:function(){
        return function(){
            this.initialize.apply(this,arguments);
        }
    }
}

var A = Class.create();

A.prototype = {
    initialize:function(v){
        this.value = v;
    },
    showValue:function(){
        alert(this.value);
    }
}

var a = new A("helloWorld!");
a.showValue();
