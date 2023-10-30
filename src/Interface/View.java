package Interface;
public interface View {
    /**
     * Интерфейс для ввода/вывода информации пользователю
     * @return выводит запрос
     */
    String Get();
    /**
     * Принимает значение для вывода пользователю
     * @param request значение для вывода на экран
     */
    void Set(String request);

}
