namespace Lab.Principles.Solid
{
    public class Livro
    {
        public string Nome { get; set; }
        public string Autor { get; set; }
        public string Texto { get; set; }

        public string SubstituirPalavraNoTexto(string palavra)
        {
            return Texto.Replace(palavra, Texto);
        }

        public bool PalavraEstáNoTexto(string palavra)
        {
            return Texto.Contains(palavra);
        }

        public void ImprimirTextoNoConsole(string texto)
        {
            Console.WriteLine("Nome do livro: {texto}");
        }
    }
}
