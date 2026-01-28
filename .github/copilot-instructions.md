# AI Coding Guidelines for JourneyTestPro

## Project Overview
This is a Java 8 Maven project demonstrating the `java.time` API for date and time operations. The main class `DateTest` in package `com.jour` showcases various LocalDate, LocalDateTime, and ZonedDateTime manipulations.

## Key Components
- **Main Class**: `src/main/java/com/jour/DateTest.java` - Contains examples of date parsing, arithmetic operations, temporal adjusters, time zone handling, and period/duration calculations.
- **Package Structure**: Uses `com.jour` package (likely "journey" abbreviation).
- **No External Dependencies**: Relies solely on Java 8 standard library.

## Developer Workflows
- **Build**: `mvn clean compile` - Compiles to `target/classes/`
- **Run**: `java -cp target/classes com.jour.Date.DateTest` - Executes the main method with console output
- **Test Structure**: `src/test/java/` is prepared for JUnit tests (none implemented yet)

## Code Patterns
- **Date Operations**: Use `LocalDate.now()`, `LocalDate.of(year, month, day)`, `LocalDate.parse("yyyy-MM-dd")`
- **Arithmetic**: `plusDays()`, `minusMonths()`, `plusYears()` for date calculations
- **Temporal Adjusters**: `with(TemporalAdjusters.lastDayOfMonth())` for special dates
- **Time Zones**: `ZonedDateTime.now(ZoneId.of("Asia/Shanghai"))` for timezone-specific operations
- **Periods/Durations**: `Period.between(date1, date2)` for date differences, `Duration.between(time1, time2)` for time differences
- **Output**: Console prints with Chinese labels (e.g., "昨天" for yesterday, "明天" for tomorrow)

## Conventions
- **Language**: Java 8 (source/target 8)
- **Comments**: Mix of English and Chinese explanatory comments
- **Naming**: Standard camelCase, procedural style in main method
- **Error Handling**: None implemented - focus on demonstration code

## Extension Guidelines
- Add new date/time examples in the main method or create separate methods
- When adding tests, use JUnit 4+ in `src/test/java/com/jour/` with matching class names (e.g., `DateTestTest.java`)
- Maintain Chinese output labels for consistency with existing examples
- For timezone examples, prefer "Asia/Shanghai" and "America/New_York" as shown

## Key Files
- `pom.xml`: Simple Maven config with Java 8 settings
- `src/main/java/com/jour/DateTest.java`: Primary code with comprehensive date/time API examples