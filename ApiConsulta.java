import java.util.Map;

public record ApiConsulta(Map<String, Double> conversion_rates, String base_code) {
}