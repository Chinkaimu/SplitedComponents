
/********快速排序开始***************/
function partition(items,low,high){
    //console.log("low = " + low + ";high = " + high);
    var pivot = items[low];
    //console.log("pivot = " + pivot);

    while(low < high) {
        while (low<high && items[high]>=pivot) --high;
            //console.log("while high = " + high);
            //console.log("items.high = " + items[high])
        items[low] = items[high];
        //console.log("1 items = " + items);

        while (low < high && items[low] <= pivot) ++low;
        items[high] = items[low];
        //console.log("2 items = " + items);
    }


    items[low] = pivot;

    //console.log("3 items = " + items);
    return low;
}

function quicksort(items,low,high){
    if(low < high) {   //***
        var pivotLoc = partition(items, low, high);
        //console.log("pivotLoc = " + pivotLoc);

        arguments.callee(items, low, pivotLoc - 1);
        arguments.callee(items, pivotLoc + 1, high);
    }
    return items;
}
/********快速排序结束***************/

/********冒泡排序开始***************/
function bubblesort(items){

    var n = items.length;
    var flag = 0;

    for(var i = 1 ; i < n ; i++){
        for(var j = 1 ; j <= n-i ; j++){
            if(items[j-1] > items[j]){
                flag++;
                var temp = items[j-1];
                items[j-1] = items[j];
                items[j] = temp;
            }
        }
        if(flag == 0) break;
    }

    return items;
}
/********冒泡排序结束***************/

function sort(type){

    var items = document.getElementById("sort_items").value.split(",");
    for(var i in items){
       items[i] = parseInt(items[i]);
    }

    if("quick" == type) {
        //console.log("items = " + items);
        var result = quicksort(items, 0, items.length - 1);
        //console.log(result);
    }else if("bubble" == type){
        result = bubblesort(items);
    }

    document.getElementById("sort_result").innerHTML = result;
};