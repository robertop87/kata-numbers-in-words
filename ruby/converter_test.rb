require 'test/unit'
require_relative 'converter'

class ConverterTest < Test::Unit::TestCase
	def setup
		@converter = Converter.new
	end

	def test_OneDigitToWord
		assert_equal "one", @converter.number_to_word(1)
	end
end
