package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_asus_movilgps_models_ContactoRealmProxy extends com.example.asus.movilgps.models.Contacto
    implements RealmObjectProxy, com_example_asus_movilgps_models_ContactoRealmProxyInterface {

    static final class ContactoColumnInfo extends ColumnInfo {
        long idIndex;
        long encuestaIndex;
        long telefonoIndex;

        ContactoColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Contacto");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.encuestaIndex = addColumnDetails("encuesta", "encuesta", objectSchemaInfo);
            this.telefonoIndex = addColumnDetails("telefono", "telefono", objectSchemaInfo);
        }

        ContactoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactoColumnInfo src = (ContactoColumnInfo) rawSrc;
            final ContactoColumnInfo dst = (ContactoColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.encuestaIndex = src.encuestaIndex;
            dst.telefonoIndex = src.telefonoIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ContactoColumnInfo columnInfo;
    private ProxyState<com.example.asus.movilgps.models.Contacto> proxyState;

    com_example_asus_movilgps_models_ContactoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.asus.movilgps.models.Contacto>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$encuesta() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.encuestaIndex);
    }

    @Override
    public void realmSet$encuesta(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'encuesta' to null.");
            }
            row.getTable().setString(columnInfo.encuestaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'encuesta' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.encuestaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$telefono() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.telefonoIndex);
    }

    @Override
    public void realmSet$telefono(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'telefono' to null.");
            }
            row.getTable().setString(columnInfo.telefonoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'telefono' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.telefonoIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Contacto", 3, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("encuesta", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("telefono", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactoColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ContactoColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Contacto";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Contacto";
    }

    @SuppressWarnings("cast")
    public static com.example.asus.movilgps.models.Contacto createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.asus.movilgps.models.Contacto obj = null;
        if (update) {
            Table table = realm.getTable(com.example.asus.movilgps.models.Contacto.class);
            ContactoColumnInfo columnInfo = (ContactoColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_asus_movilgps_models_ContactoRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_asus_movilgps_models_ContactoRealmProxy) realm.createObjectInternal(com.example.asus.movilgps.models.Contacto.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_asus_movilgps_models_ContactoRealmProxy) realm.createObjectInternal(com.example.asus.movilgps.models.Contacto.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_asus_movilgps_models_ContactoRealmProxyInterface objProxy = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) obj;
        if (json.has("encuesta")) {
            if (json.isNull("encuesta")) {
                objProxy.realmSet$encuesta(null);
            } else {
                objProxy.realmSet$encuesta((String) json.getString("encuesta"));
            }
        }
        if (json.has("telefono")) {
            if (json.isNull("telefono")) {
                objProxy.realmSet$telefono(null);
            } else {
                objProxy.realmSet$telefono((String) json.getString("telefono"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.asus.movilgps.models.Contacto createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.asus.movilgps.models.Contacto obj = new com.example.asus.movilgps.models.Contacto();
        final com_example_asus_movilgps_models_ContactoRealmProxyInterface objProxy = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("encuesta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$encuesta((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$encuesta(null);
                }
            } else if (name.equals("telefono")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$telefono((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$telefono(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.example.asus.movilgps.models.Contacto copyOrUpdate(Realm realm, com.example.asus.movilgps.models.Contacto object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.asus.movilgps.models.Contacto) cachedRealmObject;
        }

        com.example.asus.movilgps.models.Contacto realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.asus.movilgps.models.Contacto.class);
            ContactoColumnInfo columnInfo = (ContactoColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_asus_movilgps_models_ContactoRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.example.asus.movilgps.models.Contacto copy(Realm realm, com.example.asus.movilgps.models.Contacto newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.asus.movilgps.models.Contacto) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.asus.movilgps.models.Contacto realmObject = realm.createObjectInternal(com.example.asus.movilgps.models.Contacto.class, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_asus_movilgps_models_ContactoRealmProxyInterface realmObjectSource = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) newObject;
        com_example_asus_movilgps_models_ContactoRealmProxyInterface realmObjectCopy = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$encuesta(realmObjectSource.realmGet$encuesta());
        realmObjectCopy.realmSet$telefono(realmObjectSource.realmGet$telefono());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.asus.movilgps.models.Contacto object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.asus.movilgps.models.Contacto.class);
        long tableNativePtr = table.getNativePtr();
        ContactoColumnInfo columnInfo = (ContactoColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$encuesta = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$encuesta();
        if (realmGet$encuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.encuestaIndex, rowIndex, realmGet$encuesta, false);
        }
        String realmGet$telefono = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$telefono();
        if (realmGet$telefono != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.asus.movilgps.models.Contacto.class);
        long tableNativePtr = table.getNativePtr();
        ContactoColumnInfo columnInfo = (ContactoColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.asus.movilgps.models.Contacto object = null;
        while (objects.hasNext()) {
            object = (com.example.asus.movilgps.models.Contacto) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$encuesta = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$encuesta();
            if (realmGet$encuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.encuestaIndex, rowIndex, realmGet$encuesta, false);
            }
            String realmGet$telefono = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$telefono();
            if (realmGet$telefono != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.asus.movilgps.models.Contacto object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.asus.movilgps.models.Contacto.class);
        long tableNativePtr = table.getNativePtr();
        ContactoColumnInfo columnInfo = (ContactoColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$encuesta = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$encuesta();
        if (realmGet$encuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.encuestaIndex, rowIndex, realmGet$encuesta, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.encuestaIndex, rowIndex, false);
        }
        String realmGet$telefono = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$telefono();
        if (realmGet$telefono != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.telefonoIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.asus.movilgps.models.Contacto.class);
        long tableNativePtr = table.getNativePtr();
        ContactoColumnInfo columnInfo = (ContactoColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.Contacto.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.asus.movilgps.models.Contacto object = null;
        while (objects.hasNext()) {
            object = (com.example.asus.movilgps.models.Contacto) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$encuesta = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$encuesta();
            if (realmGet$encuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.encuestaIndex, rowIndex, realmGet$encuesta, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.encuestaIndex, rowIndex, false);
            }
            String realmGet$telefono = ((com_example_asus_movilgps_models_ContactoRealmProxyInterface) object).realmGet$telefono();
            if (realmGet$telefono != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.telefonoIndex, rowIndex, false);
            }
        }
    }

    public static com.example.asus.movilgps.models.Contacto createDetachedCopy(com.example.asus.movilgps.models.Contacto realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.asus.movilgps.models.Contacto unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.asus.movilgps.models.Contacto();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.asus.movilgps.models.Contacto) cachedObject.object;
            }
            unmanagedObject = (com.example.asus.movilgps.models.Contacto) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_asus_movilgps_models_ContactoRealmProxyInterface unmanagedCopy = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) unmanagedObject;
        com_example_asus_movilgps_models_ContactoRealmProxyInterface realmSource = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$encuesta(realmSource.realmGet$encuesta());
        unmanagedCopy.realmSet$telefono(realmSource.realmGet$telefono());

        return unmanagedObject;
    }

    static com.example.asus.movilgps.models.Contacto update(Realm realm, com.example.asus.movilgps.models.Contacto realmObject, com.example.asus.movilgps.models.Contacto newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_example_asus_movilgps_models_ContactoRealmProxyInterface realmObjectTarget = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) realmObject;
        com_example_asus_movilgps_models_ContactoRealmProxyInterface realmObjectSource = (com_example_asus_movilgps_models_ContactoRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$encuesta(realmObjectSource.realmGet$encuesta());
        realmObjectTarget.realmSet$telefono(realmObjectSource.realmGet$telefono());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Contacto = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{encuesta:");
        stringBuilder.append(realmGet$encuesta());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{telefono:");
        stringBuilder.append(realmGet$telefono());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_asus_movilgps_models_ContactoRealmProxy aContacto = (com_example_asus_movilgps_models_ContactoRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aContacto.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContacto.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aContacto.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
