using System;

namespace Lab.Principles.Solid
{
    // Classe Livro: Responsável por armazenar e manipular dados de um livro
    public class Livro
    {
        public string Nome { get; set; }
        public string Autor { get; set; }
        public string Texto { get; set; }

        public string SubstituirPalavraNoTexto(string palavra, string substituicao)
        {
            return Texto.Replace(palavra, substituicao);
        }

        public bool PalavraEstáNoTexto(string palavra)
        {
            return Texto.Contains(palavra);
        }
    }

    // Classe ImpressoraDeLivro: Responsável por imprimir o texto de um livro
    public class ImpressoraDeLivro
    {
        public void ImprimirTextoNoConsole(Livro livro)
        {
            Console.WriteLine($"Nome do livro: {livro.Nome}");
            Console.WriteLine($"Texto: {livro.Texto}");
        }

        public void ImprimirTextoEmOutroMeio(string texto)
        {
            // Exemplo de outra saída; pode ser um arquivo, por exemplo
            Console.WriteLine($"{texto}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Cria um livro
            Livro livro = new Livro
            {
                Nome = "O Senhor dos Anéis",
                Autor = "J.R.R. Tolkien",
                Texto = "Em uma toca no chão vivia um hobbit."
            };

            // Cria uma impressora de livro
            ImpressoraDeLivro impressora = new ImpressoraDeLivro();

            // Imprime o texto no console
            impressora.ImprimirTextoNoConsole(livro);

            // Substitui uma palavra no texto e imprime novamente
            livro.Texto = livro.SubstituirPalavraNoTexto("hobbit", "elfo");
            impressora.ImprimirTextoNoConsole(livro);
        }
    }
}