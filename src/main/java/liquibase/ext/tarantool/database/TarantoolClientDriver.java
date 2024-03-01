package liquibase.ext.tarantool.database;

import io.tarantool.driver.api.TarantoolClient;
import io.tarantool.driver.api.TarantoolClientFactory;
import io.tarantool.driver.api.TarantoolResult;
import io.tarantool.driver.api.tuple.TarantoolTuple;

import java.util.List;

public class TarantoolClientDriver 
{
    public static void main( String[] args ) throws InterruptedException, java.util.concurrent.ExecutionException
    {
        TarantoolClient<TarantoolTuple, TarantoolResult<TarantoolTuple>> client = TarantoolClientFactory.createClient()
            .withAddress("localhost", 3301)
            .withCredentials("test", "test")
            .build();

        List<?> version = client.eval("return box.info.version").get();

        System.out.println(version.get(0));
    }
}
