namespace KataNumberInWordTests
{
    using System.Collections.Generic;

    using KataNumberInWord;

    using Microsoft.VisualStudio.TestTools.UnitTesting;

    [TestClass]
    public class ConverterTest
    {
        private Dictionary<int, string> singleDigits;

        [TestInitialize]
        public void Init()
        {
            this.singleDigits = new Dictionary<int, string>()
            {
                {0, "zero"},
                {1, "one"},
                {2, "two"},
                {3, "three"},
                {4, "four"},
                {5, "five"},
                {6, "six"},
                {7, "seven"},
                {8, "eight"},
                {9, "nine"}
            };
        }


        [TestMethod]
        public void OneDigitInWordTest()
        {
            var converter = new Converter();
            var expectedWord = "one";
            Assert.AreEqual(expectedWord, converter.numberToWord(1));
        }

        [TestMethod]
        public void AllValidSingleDigitInWordTest()
        {
            var converter = new Converter();
            foreach (var tuple in this.singleDigits)
            {
                Assert.AreEqual(tuple.Value, converter.numberToWord(tuple.Key));
            }
        }
    }
}