import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        Scanner lectura = new Scanner(System.in);
        Scanner lecturaCantidad = new Scanner(System.in);


        List<Double> moneda = new ArrayList<>();
        int opcion = 0;


        while (true) {
            String direccionApi = "https://v6.exchangerate-api.com/v6/f65772d9680322eabe5f7d69/latest/";
            double dineroIngresado;
            var tipoCambioInicio = "";
            var tipoCambioFin = "";
            var cambioA = "";
            var cambioB = "";
            String menuChalenge = """
                    
                    Menu conversor de monedas:
                    
                    1 - Dolar -> Peso Argentino
                    2 - Peso Argentino -> Dolar
                    3 - Dolar -> Real Brasileño
                    4 - Real Brasileño -> Dolar
                    5 - Dolar -> Peso Colombiano
                    6 - Peso Colombiano -> Dolar
                    7 - Salir
                    
                    Ingrese una opcion: 
                    """;

            System.out.println(menuChalenge);
            opcion = respuesta.nextInt();

            System.out.println("Ingrese el valor que desea convertir: ");

            if (opcion == 7) {
                break;
            }
            switch (opcion) {
                case 1:
                    dineroIngresado = lecturaCantidad.nextDouble();
                    tipoCambioInicio = "USD";
                    tipoCambioFin = "ARS";
                    cambioA = " USD";
                    cambioB = " ARS";
                    direccionApi +=  tipoCambioInicio;
                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccionApi))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        String RespuestaApi = response.body();
                        Gson gson = new Gson();
                        ApiConsulta miApiConsulta = gson.fromJson(RespuestaApi, ApiConsulta.class);
                        var tipoCambio = miApiConsulta.conversion_rates().get(tipoCambioFin);
                        var resultado = dineroIngresado * tipoCambio;
                        System.out.println("Cantidad a convertir: " + dineroIngresado +cambioA);
                        System.out.println("Valor de la tasa de cambio: " + tipoCambio+ cambioB +"\n");
                        System.out.println("Los " + dineroIngresado + cambioA  +
                                " son iguales a " + resultado + cambioB);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    dineroIngresado = lecturaCantidad.nextDouble();
                    tipoCambioInicio = "ARS";
                    tipoCambioFin = "USD";
                    cambioA = " ARS";
                    cambioB = " USD";
                    direccionApi +=  tipoCambioInicio;
                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccionApi))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        String RespuestaApi = response.body();
                        Gson gson = new Gson();
                        ApiConsulta miApiConsulta = gson.fromJson(RespuestaApi, ApiConsulta.class);
                        var tipoCambio = miApiConsulta.conversion_rates().get(tipoCambioFin);
                        var resultado = dineroIngresado * tipoCambio;
                        System.out.println("Cantidad a convertir: " + dineroIngresado +cambioA);
                        System.out.println("Valor de la tasa de cambio: " + tipoCambio+ cambioB +"\n");
                        System.out.println("Los " + dineroIngresado + cambioA  +
                                " son iguales a " + resultado + cambioB);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    dineroIngresado = lecturaCantidad.nextDouble();
                    tipoCambioInicio = "USD";
                    tipoCambioFin = "BRL";
                    cambioA = " USD";
                    cambioB = " BRL";
                    direccionApi +=  tipoCambioInicio;
                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccionApi))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        String RespuestaApi = response.body();
                        Gson gson = new Gson();
                        ApiConsulta miApiConsulta = gson.fromJson(RespuestaApi, ApiConsulta.class);
                        var tipoCambio = miApiConsulta.conversion_rates().get(tipoCambioFin);
                        var resultado = dineroIngresado * tipoCambio;
                        System.out.println("Cantidad a convertir: " + dineroIngresado +cambioA);
                        System.out.println("Valor de la tasa de cambio: " + tipoCambio+ cambioB +"\n");
                        System.out.println("Los " + dineroIngresado + cambioA  +
                                " son iguales a " + resultado + cambioB);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    dineroIngresado = lecturaCantidad.nextDouble();
                    tipoCambioInicio = "BRL";
                    tipoCambioFin = "USD";
                    cambioA = " BRL";
                    cambioB = " USD";
                    direccionApi +=  tipoCambioInicio;
                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccionApi))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        String RespuestaApi = response.body();
                        Gson gson = new Gson();
                        ApiConsulta miApiConsulta = gson.fromJson(RespuestaApi, ApiConsulta.class);
                        var tipoCambio = miApiConsulta.conversion_rates().get(tipoCambioFin);
                        var resultado = dineroIngresado * tipoCambio;
                        System.out.println("Cantidad a convertir: " + dineroIngresado +cambioA);
                        System.out.println("Valor de la tasa de cambio: " + tipoCambio+ cambioB +"\n");
                        System.out.println("Los " + dineroIngresado + cambioA  +
                                " son iguales a " + resultado + cambioB);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    dineroIngresado = lecturaCantidad.nextDouble();
                    tipoCambioInicio = "USD";
                    tipoCambioFin = "COP";
                    cambioA = " USD";
                    cambioB = " COP";
                    direccionApi +=  tipoCambioInicio;
                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccionApi))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        String RespuestaApi = response.body();
                        Gson gson = new Gson();
                        ApiConsulta miApiConsulta = gson.fromJson(RespuestaApi, ApiConsulta.class);
                        var tipoCambio = miApiConsulta.conversion_rates().get(tipoCambioFin);
                        var resultado = dineroIngresado * tipoCambio;
                        System.out.println("Cantidad a convertir: " + dineroIngresado +cambioA);
                        System.out.println("Valor de la tasa de cambio: " + tipoCambio+ cambioB +"\n");
                        System.out.println("Los " + dineroIngresado + cambioA  +
                                " son iguales a " + resultado + cambioB);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 6:
                    dineroIngresado = lecturaCantidad.nextDouble();
                    tipoCambioInicio = "COP";
                    tipoCambioFin = "USD";
                    cambioA = " COP";
                    cambioB = " USD";
                    direccionApi +=  tipoCambioInicio;

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccionApi))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        String RespuestaApi = response.body();
                        Gson gson = new Gson();
                        ApiConsulta miApiConsulta = gson.fromJson(RespuestaApi, ApiConsulta.class);
                        var tipoCambio = miApiConsulta.conversion_rates().get(tipoCambioFin);
                        var resultado = dineroIngresado * tipoCambio;
                        System.out.println("Cantidad a convertir: " + dineroIngresado +cambioA);
                        System.out.println("Valor de la tasa de cambio: " + tipoCambio+ cambioB +"\n");
                        System.out.println("Los " + dineroIngresado + cambioA  +
                                " son iguales a " + resultado + cambioB);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                default:
                    System.out.println("Opcion no admitida \nPor favor seleccione una opcion del menu.");

            }


        }

        System.out.println("Fin del programa");
    }
}