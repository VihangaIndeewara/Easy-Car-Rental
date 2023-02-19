$("#home").click(function (){
    $("#HomePage").css("display","block")
    $("#CarManagerPage").css("display","none")
    $("#AdminPage").css("display","none")
    $("#CustomersManagerPage").css("display","none")

});

$("#cars").click(function (){
    $("#HomePage").css("display","none")
    $("#CarManagerPage").css("display","block")
    $("#AdminPage").css("display","none")
    $("#CustomersManagerPage").css("display","none")
});

$("#admin").click(function (){
    $("#HomePage").css("display","none")
    $("#CarManagerPage").css("display","none")
    $("#AdminPage").css("display","block")
    $("#CustomersManagerPage").css("display","none")
})

$("#customers").click(function (){
    $("#HomePage").css("display","none")
    $("#CarManagerPage").css("display","none")
    $("#AdminPage").css("display","none")
    $("#CustomersManagerPage").css("display","block")
})