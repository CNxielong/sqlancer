package sqlancer.clickhouse;

import sqlancer.common.query.ExpectedErrors;

public final class ClickHouseErrors {

    private ClickHouseErrors() {
    }

    public static void addExpectedExpressionErrors(ExpectedErrors errors) {
        errors.add("Argument at index 1 for function like must be constant");
        errors.add("Argument at index 1 for function notLike must be constant");
        errors.add("Attempt to read after eof: while converting");
        errors.add("Bad get: has Int64, requested UInt64");
        errors.add("Cannot convert string");
        errors.add("Cannot insert NULL value into a column of type");
        errors.add("Cannot parse Int32 from String, because value is too short");
        errors.add("Cannot parse NaN.: while converting"); // https://github.com/ClickHouse/ClickHouse/issues/22710
        errors.add("Cannot parse infinity.");
        errors.add("Cannot parse number with a sign character but without any numeric character");
        errors.add("Cannot parse number with multiple sign (+/-) characters or intermediate sign character");
        errors.add("Cannot parse string");
        errors.add("Cannot read floating point value");
        errors.add("Cyclic aliases: default expression and column type are incompatible");
        errors.add("Directory for table data");
        errors.add("Directory not empty");
        errors.add("Expected one of: compound identifier, identifier, list of elements (version"); // VALUES ()
        errors.add("Function 'like' doesn't support search with non-constant needles in constant haystack");
        errors.add("Illegal type");
        errors.add("Illegal value (aggregate function) for positional argument in GROUP BY");
        errors.add("Invalid escape sequence at the end of LIKE pattern");
        errors.add("Invalid type for filter in");
        errors.add("Memory limit");
        errors.add("OptimizedRegularExpression: cannot compile re2");
        errors.add("Partition key cannot contain constants");
        errors.add("Positional argument out of bounds");
        errors.add("Sampling expression must be present in the primary key");
        errors.add("Sorting key cannot contain constants");
        errors.add("There is no supertype for types");
        errors.add("argument of function");
        errors.add("because it is constant but values of constants are different in source and result"); // https://github.com/ClickHouse/ClickHouse/issues/22119
        errors.add("but its arguments considered equal according to constraints");
        errors.add("does not return a value of type UInt8");
        errors.add("does not return a value of type UInt8");
        errors.add("doesn't exist"); // TODO: consecutive test runs can lead to dropped database
        errors.add("in block. There are only columns:"); // https://github.com/ClickHouse/ClickHouse/issues/42399
        errors.add("invalid character class range");
        errors.add("invalid escape sequence");
        errors.add("is not under aggregate function and not in GROUP BY");
        errors.add("is not under aggregate function");
        errors.add("is violated at row 1. Expression:"); // TODO: check constraint on table creation
        errors.add(
                "is violated, because it is a constant expression returning 0. It is most likely an error in table definition");
        errors.add("there are only columns");
        errors.add("there are columns");
        errors.add("in block. (NOT_FOUND_COLUMN_IN_BLOCK)");
    }

}
