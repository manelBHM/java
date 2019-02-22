package co.simplon.ExerciceMavenAchat;

public interface Writer {
    /**

     * Start writing process

     */

    public void start();
    /**

     * Write on line

     * @param line

     */

    public void writeLine(String line);
    /**

     * Stop writing process

     */

    public void stop();
    public void template();
	
}