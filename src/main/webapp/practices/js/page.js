/**
 * 现有一个Page类,其原型对象上有许多以post开头的方法(如postMsg);另有一拦截函数chekc,只返回ture或false.
 * 请设计一个函数,该函数应批量改造原Page的postXXX方法,在保留其原有功能的同时,为每个postXXX方法增加拦截验证
 * 功能,当check返回true时继续执行原postXXX方法,返回false时不再执行原postXXX方法
 */

function Page(){}

Page.prototype = {
     constructor: Page,

     postA: function(a){
         console.log("a : " + a);
     },
     postB: function(b){
         console.log("b : " + b);
     },
     postC: function(c){
         console.log("c : " + c);
     },
     check: function(){
         return Math.random() > 0.5;
     }
}

function checkfy(obj){
    for(var key in obj){
        if(key.indexOf("post") === 0 && typeof obj[key] === "function"){
            (function(key) {
                var fn = obj[key];

                obj[key] = function () {
                    if (obj.check()) {

                        //注意传入arguments参数
                        fn.apply(obj,arguments);
                    }
                }
            })(key);
        }
    }
}

checkfy(Page.prototype);

var testObj = new Page();
testObj.postA("checkfy");
testObj.postB("checkfy");
testObj.postC("checkfy");
