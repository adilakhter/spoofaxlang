package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_table_descriptor_0_0 extends Strategy 
{ 
  public static parse_table_descriptor_0_0 instance = new parse_table_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parse_table_descriptor_0_0");
    Fail25813:
    { 
      IStrategoTerm x_4264 = null;
      Success10197:
      { 
        Fail25814:
        { 
          term = $Cached$Parse$Table$Descriptor_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25814;
          if(true)
            break Success10197;
        }
        IStrategoTerm y_4264 = null;
        IStrategoTerm z_4264 = null;
        IStrategoTerm d_4265 = null;
        IStrategoTerm e_4265 = null;
        IStrategoTerm g_4265 = null;
        IStrategoTerm h_4265 = null;
        IStrategoTerm i_4265 = null;
        term = open_parse_table_0_0.instance.invoke(context, generator.constEditorServiceTbl);
        if(term == null)
          break Fail25813;
        x_4264 = term;
        y_4264 = term;
        term = x_4264;
        z_4264 = x_4264;
        g_4265 = term;
        d_4265 = generator.const7154;
        h_4265 = g_4265;
        e_4265 = generator.constCons4561;
        i_4265 = h_4265;
        term = termFactory.makeTuple(generator.const7155, z_4264);
        term = dr_set_rule_0_3.instance.invoke(context, i_4265, d_4265, e_4265, term);
        if(term == null)
          break Fail25813;
        term = y_4264;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}