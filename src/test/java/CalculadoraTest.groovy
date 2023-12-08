import spock.lang.Specification

class CalculadoraTest extends Specification {

    def "deve retornar soma dos numeros inteiros"() {
        given:
        Calculadora calculadora = new Calculadora();

        when:
        def resultado = calculadora.somar(2, 3)

        then:
        resultado == 5
    }

    def "deve retornar subtracao dos numeros inteiros"() {
        given:
        Calculadora calculadora = new Calculadora();

        when:
        def resultado = calculadora.subtrair(5, 2)

        then:
        resultado == 3
    }

    def "deve retornar excecao quando divido por zero"() {
        given:
        Calculadora calculadora = new Calculadora();

        when:
        def resultado = calculadora.dividir(2, 0)

        then:
        resultado == 0
    }

    def "deve retornar multiplicacao dos numeros inteiros "() {
        given:
        Calculadora calculadora = new Calculadora();

        when:
        def resultado = calculadora.multiplicar(2,2);

        then:
        resultado == 4
    }
}
