$("#btnSearchVehicle").click(function (){
    $("#CustomerDashboardPage").css("display","none")
    $("#VehiclePage").css("display","block")
    $("#VehicleBookingPage").css("display","none")
})

$(".bookNow").click(function (){
    $("#CustomerDashboardPage").css("display","none")
    $("#VehiclePage").css("display","none")
    $("#VehicleBookingPage").css("display","block")
})