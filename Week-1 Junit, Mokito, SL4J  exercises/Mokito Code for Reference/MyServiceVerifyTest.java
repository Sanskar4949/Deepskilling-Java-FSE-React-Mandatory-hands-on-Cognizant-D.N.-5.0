package com.cognizant.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceVerifyTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Create service using mock
        MyService service = new MyService(mockApi);

        // Call method
        String result = service.fetchData();

        // Verify interaction
        verify(mockApi).getData();

        // Check result
        assertEquals("Mock Data", result);
    }
}