package pprog.tp3.model;

/**
 * Esta classe permite o cálculo da distância entre pontos definidos pelas suas
 * coordenadas.
 *
 * @author António (1171343) & João (1161874)
 */
public class CalculoDistancia {

    public CalculoDistancia() {
        
        
        
    }

    /**
     * Calcula a distancia
     * 
     * @param lat1 - latitude 1
     * @param lon1 - longitude 1
     * @param lat2 - latitude 2
     * @param lon2 - longitude 2
     * 
     * @return a distancia entre dois pontos
     */
    private double distancia(double lat1, double lon1, double lat2, double lon2) {
        // shortest distance over the earth’s surface
        // https://www.movable-type.co.uk/scripts/latlong.html
        final double R = 6371e3;
        double theta1 = Math.toRadians(lat1);
        double theta2 = Math.toRadians(lat2);

        double deltaTheta = Math.toRadians(lat2 - lat1);
        double deltaLambda = Math.toRadians(lon2 - lon1);

        double a = Math.sin(deltaTheta / 2) * Math.sin(deltaTheta / 2) + Math.cos(theta1) * Math.cos(theta2) * Math.sin(deltaLambda / 2) * Math.sin(deltaLambda / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = R * c; // distância em metros
        return d;
    }
}
