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
public class com_example_asus_movilgps_models_usuarioRealmProxy extends com.example.asus.movilgps.models.usuario
    implements RealmObjectProxy, com_example_asus_movilgps_models_usuarioRealmProxyInterface {

    static final class usuarioColumnInfo extends ColumnInfo {
        long idIndex;
        long nombreIndex;
        long apellidoIndex;
        long telefonoIndex;
        long correoIndex;
        long passIndex;
        long loginIndex;

        usuarioColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("usuario");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nombreIndex = addColumnDetails("nombre", "nombre", objectSchemaInfo);
            this.apellidoIndex = addColumnDetails("apellido", "apellido", objectSchemaInfo);
            this.telefonoIndex = addColumnDetails("telefono", "telefono", objectSchemaInfo);
            this.correoIndex = addColumnDetails("correo", "correo", objectSchemaInfo);
            this.passIndex = addColumnDetails("pass", "pass", objectSchemaInfo);
            this.loginIndex = addColumnDetails("login", "login", objectSchemaInfo);
        }

        usuarioColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new usuarioColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final usuarioColumnInfo src = (usuarioColumnInfo) rawSrc;
            final usuarioColumnInfo dst = (usuarioColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nombreIndex = src.nombreIndex;
            dst.apellidoIndex = src.apellidoIndex;
            dst.telefonoIndex = src.telefonoIndex;
            dst.correoIndex = src.correoIndex;
            dst.passIndex = src.passIndex;
            dst.loginIndex = src.loginIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private usuarioColumnInfo columnInfo;
    private ProxyState<com.example.asus.movilgps.models.usuario> proxyState;

    com_example_asus_movilgps_models_usuarioRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (usuarioColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.asus.movilgps.models.usuario>(this);
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
    public String realmGet$nombre() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nombreIndex);
    }

    @Override
    public void realmSet$nombre(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'nombre' to null.");
            }
            row.getTable().setString(columnInfo.nombreIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'nombre' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nombreIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$apellido() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.apellidoIndex);
    }

    @Override
    public void realmSet$apellido(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'apellido' to null.");
            }
            row.getTable().setString(columnInfo.apellidoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'apellido' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.apellidoIndex, value);
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

    @Override
    @SuppressWarnings("cast")
    public String realmGet$correo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.correoIndex);
    }

    @Override
    public void realmSet$correo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'correo' to null.");
            }
            row.getTable().setString(columnInfo.correoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'correo' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.correoIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$pass() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passIndex);
    }

    @Override
    public void realmSet$pass(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pass' to null.");
            }
            row.getTable().setString(columnInfo.passIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'pass' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.passIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$login() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.loginIndex);
    }

    @Override
    public void realmSet$login(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'login' to null.");
            }
            row.getTable().setString(columnInfo.loginIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'login' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.loginIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("usuario", 7, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nombre", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("apellido", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("telefono", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("correo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("pass", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("login", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static usuarioColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new usuarioColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "usuario";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "usuario";
    }

    @SuppressWarnings("cast")
    public static com.example.asus.movilgps.models.usuario createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.asus.movilgps.models.usuario obj = null;
        if (update) {
            Table table = realm.getTable(com.example.asus.movilgps.models.usuario.class);
            usuarioColumnInfo columnInfo = (usuarioColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_asus_movilgps_models_usuarioRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_asus_movilgps_models_usuarioRealmProxy) realm.createObjectInternal(com.example.asus.movilgps.models.usuario.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_asus_movilgps_models_usuarioRealmProxy) realm.createObjectInternal(com.example.asus.movilgps.models.usuario.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_asus_movilgps_models_usuarioRealmProxyInterface objProxy = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) obj;
        if (json.has("nombre")) {
            if (json.isNull("nombre")) {
                objProxy.realmSet$nombre(null);
            } else {
                objProxy.realmSet$nombre((String) json.getString("nombre"));
            }
        }
        if (json.has("apellido")) {
            if (json.isNull("apellido")) {
                objProxy.realmSet$apellido(null);
            } else {
                objProxy.realmSet$apellido((String) json.getString("apellido"));
            }
        }
        if (json.has("telefono")) {
            if (json.isNull("telefono")) {
                objProxy.realmSet$telefono(null);
            } else {
                objProxy.realmSet$telefono((String) json.getString("telefono"));
            }
        }
        if (json.has("correo")) {
            if (json.isNull("correo")) {
                objProxy.realmSet$correo(null);
            } else {
                objProxy.realmSet$correo((String) json.getString("correo"));
            }
        }
        if (json.has("pass")) {
            if (json.isNull("pass")) {
                objProxy.realmSet$pass(null);
            } else {
                objProxy.realmSet$pass((String) json.getString("pass"));
            }
        }
        if (json.has("login")) {
            if (json.isNull("login")) {
                objProxy.realmSet$login(null);
            } else {
                objProxy.realmSet$login((String) json.getString("login"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.asus.movilgps.models.usuario createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.asus.movilgps.models.usuario obj = new com.example.asus.movilgps.models.usuario();
        final com_example_asus_movilgps_models_usuarioRealmProxyInterface objProxy = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) obj;
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
            } else if (name.equals("nombre")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nombre((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nombre(null);
                }
            } else if (name.equals("apellido")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$apellido((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$apellido(null);
                }
            } else if (name.equals("telefono")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$telefono((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$telefono(null);
                }
            } else if (name.equals("correo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$correo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$correo(null);
                }
            } else if (name.equals("pass")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pass((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pass(null);
                }
            } else if (name.equals("login")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$login((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$login(null);
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

    public static com.example.asus.movilgps.models.usuario copyOrUpdate(Realm realm, com.example.asus.movilgps.models.usuario object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.asus.movilgps.models.usuario) cachedRealmObject;
        }

        com.example.asus.movilgps.models.usuario realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.asus.movilgps.models.usuario.class);
            usuarioColumnInfo columnInfo = (usuarioColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_asus_movilgps_models_usuarioRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.example.asus.movilgps.models.usuario copy(Realm realm, com.example.asus.movilgps.models.usuario newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.asus.movilgps.models.usuario) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.asus.movilgps.models.usuario realmObject = realm.createObjectInternal(com.example.asus.movilgps.models.usuario.class, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_asus_movilgps_models_usuarioRealmProxyInterface realmObjectSource = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) newObject;
        com_example_asus_movilgps_models_usuarioRealmProxyInterface realmObjectCopy = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$nombre(realmObjectSource.realmGet$nombre());
        realmObjectCopy.realmSet$apellido(realmObjectSource.realmGet$apellido());
        realmObjectCopy.realmSet$telefono(realmObjectSource.realmGet$telefono());
        realmObjectCopy.realmSet$correo(realmObjectSource.realmGet$correo());
        realmObjectCopy.realmSet$pass(realmObjectSource.realmGet$pass());
        realmObjectCopy.realmSet$login(realmObjectSource.realmGet$login());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.asus.movilgps.models.usuario object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.asus.movilgps.models.usuario.class);
        long tableNativePtr = table.getNativePtr();
        usuarioColumnInfo columnInfo = (usuarioColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$nombre = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$nombre();
        if (realmGet$nombre != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nombreIndex, rowIndex, realmGet$nombre, false);
        }
        String realmGet$apellido = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$apellido();
        if (realmGet$apellido != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.apellidoIndex, rowIndex, realmGet$apellido, false);
        }
        String realmGet$telefono = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$telefono();
        if (realmGet$telefono != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
        }
        String realmGet$correo = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$correo();
        if (realmGet$correo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.correoIndex, rowIndex, realmGet$correo, false);
        }
        String realmGet$pass = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$pass();
        if (realmGet$pass != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passIndex, rowIndex, realmGet$pass, false);
        }
        String realmGet$login = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$login();
        if (realmGet$login != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.loginIndex, rowIndex, realmGet$login, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.asus.movilgps.models.usuario.class);
        long tableNativePtr = table.getNativePtr();
        usuarioColumnInfo columnInfo = (usuarioColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.asus.movilgps.models.usuario object = null;
        while (objects.hasNext()) {
            object = (com.example.asus.movilgps.models.usuario) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$nombre = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$nombre();
            if (realmGet$nombre != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nombreIndex, rowIndex, realmGet$nombre, false);
            }
            String realmGet$apellido = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$apellido();
            if (realmGet$apellido != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.apellidoIndex, rowIndex, realmGet$apellido, false);
            }
            String realmGet$telefono = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$telefono();
            if (realmGet$telefono != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
            }
            String realmGet$correo = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$correo();
            if (realmGet$correo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.correoIndex, rowIndex, realmGet$correo, false);
            }
            String realmGet$pass = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$pass();
            if (realmGet$pass != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passIndex, rowIndex, realmGet$pass, false);
            }
            String realmGet$login = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$login();
            if (realmGet$login != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.loginIndex, rowIndex, realmGet$login, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.asus.movilgps.models.usuario object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.asus.movilgps.models.usuario.class);
        long tableNativePtr = table.getNativePtr();
        usuarioColumnInfo columnInfo = (usuarioColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$nombre = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$nombre();
        if (realmGet$nombre != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nombreIndex, rowIndex, realmGet$nombre, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nombreIndex, rowIndex, false);
        }
        String realmGet$apellido = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$apellido();
        if (realmGet$apellido != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.apellidoIndex, rowIndex, realmGet$apellido, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.apellidoIndex, rowIndex, false);
        }
        String realmGet$telefono = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$telefono();
        if (realmGet$telefono != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.telefonoIndex, rowIndex, false);
        }
        String realmGet$correo = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$correo();
        if (realmGet$correo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.correoIndex, rowIndex, realmGet$correo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.correoIndex, rowIndex, false);
        }
        String realmGet$pass = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$pass();
        if (realmGet$pass != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passIndex, rowIndex, realmGet$pass, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passIndex, rowIndex, false);
        }
        String realmGet$login = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$login();
        if (realmGet$login != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.loginIndex, rowIndex, realmGet$login, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.loginIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.asus.movilgps.models.usuario.class);
        long tableNativePtr = table.getNativePtr();
        usuarioColumnInfo columnInfo = (usuarioColumnInfo) realm.getSchema().getColumnInfo(com.example.asus.movilgps.models.usuario.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.asus.movilgps.models.usuario object = null;
        while (objects.hasNext()) {
            object = (com.example.asus.movilgps.models.usuario) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$nombre = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$nombre();
            if (realmGet$nombre != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nombreIndex, rowIndex, realmGet$nombre, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nombreIndex, rowIndex, false);
            }
            String realmGet$apellido = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$apellido();
            if (realmGet$apellido != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.apellidoIndex, rowIndex, realmGet$apellido, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.apellidoIndex, rowIndex, false);
            }
            String realmGet$telefono = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$telefono();
            if (realmGet$telefono != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telefonoIndex, rowIndex, realmGet$telefono, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.telefonoIndex, rowIndex, false);
            }
            String realmGet$correo = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$correo();
            if (realmGet$correo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.correoIndex, rowIndex, realmGet$correo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.correoIndex, rowIndex, false);
            }
            String realmGet$pass = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$pass();
            if (realmGet$pass != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passIndex, rowIndex, realmGet$pass, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passIndex, rowIndex, false);
            }
            String realmGet$login = ((com_example_asus_movilgps_models_usuarioRealmProxyInterface) object).realmGet$login();
            if (realmGet$login != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.loginIndex, rowIndex, realmGet$login, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.loginIndex, rowIndex, false);
            }
        }
    }

    public static com.example.asus.movilgps.models.usuario createDetachedCopy(com.example.asus.movilgps.models.usuario realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.asus.movilgps.models.usuario unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.asus.movilgps.models.usuario();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.asus.movilgps.models.usuario) cachedObject.object;
            }
            unmanagedObject = (com.example.asus.movilgps.models.usuario) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_asus_movilgps_models_usuarioRealmProxyInterface unmanagedCopy = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) unmanagedObject;
        com_example_asus_movilgps_models_usuarioRealmProxyInterface realmSource = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$nombre(realmSource.realmGet$nombre());
        unmanagedCopy.realmSet$apellido(realmSource.realmGet$apellido());
        unmanagedCopy.realmSet$telefono(realmSource.realmGet$telefono());
        unmanagedCopy.realmSet$correo(realmSource.realmGet$correo());
        unmanagedCopy.realmSet$pass(realmSource.realmGet$pass());
        unmanagedCopy.realmSet$login(realmSource.realmGet$login());

        return unmanagedObject;
    }

    static com.example.asus.movilgps.models.usuario update(Realm realm, com.example.asus.movilgps.models.usuario realmObject, com.example.asus.movilgps.models.usuario newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_example_asus_movilgps_models_usuarioRealmProxyInterface realmObjectTarget = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) realmObject;
        com_example_asus_movilgps_models_usuarioRealmProxyInterface realmObjectSource = (com_example_asus_movilgps_models_usuarioRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$nombre(realmObjectSource.realmGet$nombre());
        realmObjectTarget.realmSet$apellido(realmObjectSource.realmGet$apellido());
        realmObjectTarget.realmSet$telefono(realmObjectSource.realmGet$telefono());
        realmObjectTarget.realmSet$correo(realmObjectSource.realmGet$correo());
        realmObjectTarget.realmSet$pass(realmObjectSource.realmGet$pass());
        realmObjectTarget.realmSet$login(realmObjectSource.realmGet$login());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("usuario = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nombre:");
        stringBuilder.append(realmGet$nombre());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{apellido:");
        stringBuilder.append(realmGet$apellido());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{telefono:");
        stringBuilder.append(realmGet$telefono());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{correo:");
        stringBuilder.append(realmGet$correo());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pass:");
        stringBuilder.append(realmGet$pass());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{login:");
        stringBuilder.append(realmGet$login());
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
        com_example_asus_movilgps_models_usuarioRealmProxy ausuario = (com_example_asus_movilgps_models_usuarioRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = ausuario.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = ausuario.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != ausuario.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
