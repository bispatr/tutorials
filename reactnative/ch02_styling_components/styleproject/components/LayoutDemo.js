import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
const LayoutDemo = () => {
    return (
      <View style = {{ backgroundColor: "#ffffff" }}>
      <View>
        <Text style={{fontSize: 12, color: "#000" }}>Log Rocket Store</Text>
      </View>
    </View>
    );
};

const styles = StyleSheet.create({
    container: {
      flex: 1,
      padding: 20,
      backgroundColor:'red'
    },
  });
  
export default LayoutDemo;