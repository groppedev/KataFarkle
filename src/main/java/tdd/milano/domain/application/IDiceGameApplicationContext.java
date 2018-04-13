package tdd.milano.domain.application;

public interface IDiceGameApplicationContext 
{
	/**
	 * Fornisce uno specifico componente
	 * 
	 * @param componentID ID che identifica univocamente il componente.
	 * @param componentType Tipologia del componente.
	 * 
	 * @return Componente richiesto.
	 */
	<T> T getComponent(String componentID, Class<T> componentType);
}
