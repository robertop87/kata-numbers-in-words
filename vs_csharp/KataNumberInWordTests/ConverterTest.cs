namespace KataNumberInWordTests
{
    using System.Collections.Generic;
    using System.IO;

    using KataNumberInWord;

    using Microsoft.VisualStudio.TestTools.UnitTesting;

    [TestClass]
    public class ConverterTest
    {
        private Dictionary<int, string> singleDigits;
        private Converter converter;

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

            this.converter = new Converter();
        }


        [TestMethod]
        public void OneDigitInWordTest()
        {
            Assert.AreEqual("one", this.converter.NumberToWord(1));
        }

        [TestMethod]
        public void AllValidSingleDigitInWordTest()
        {
            foreach (var tuple in this.singleDigits)
            {
                Assert.AreEqual(tuple.Value, this.converter.NumberToWord(tuple.Key));
            }
        }

        [TestMethod]
        [ExpectedException(typeof(InvalidDataException))]
        public void NegativeNumberInWordTest()
        {
            var res = this.converter.NumberToWord(-1);
        }
    }
}
