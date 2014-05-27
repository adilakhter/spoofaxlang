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

@SuppressWarnings("all") public class sdf_symbol_to_string_0_0 extends Strategy 
{ 
  public static sdf_symbol_to_string_0_0 instance = new sdf_symbol_to_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("sdf_symbol_to_string_0_0");
    Fail25679:
    { 
      IStrategoTerm term10181 = term;
      Success10145:
      { 
        Fail25680:
        { 
          term = $Symbol2$String_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25680;
          term = newname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25680;
          if(true)
            break Success10145;
        }
        term = term10181;
        IStrategoTerm k_4246 = null;
        IStrategoTerm l_4246 = null;
        IStrategoTerm n_4246 = null;
        IStrategoTerm o_4246 = null;
        IStrategoTerm p_4246 = null;
        IStrategoTerm s_4246 = null;
        IStrategoTerm u_4246 = null;
        IStrategoTerm v_4246 = null;
        IStrategoTerm w_4246 = null;
        IStrategoTerm y_4246 = null;
        IStrategoTerm z_4246 = null;
        IStrategoTerm a_4247 = null;
        IStrategoTerm c_4247 = null;
        IStrategoTerm d_4247 = null;
        IStrategoTerm e_4247 = null;
        IStrategoTerm f_4247 = null;
        IStrategoTerm h_4247 = null;
        IStrategoTerm i_4247 = null;
        IStrategoTerm j_4247 = null;
        n_4246 = term;
        k_4246 = generator.constWarning0;
        o_4246 = n_4246;
        l_4246 = generator.const7110;
        term = o_4246;
        p_4246 = o_4246;
        term = log_sym_0_3.instance.invoke(context, p_4246, k_4246, l_4246, term);
        if(term == null)
          break Fail25679;
        u_4246 = term;
        s_4246 = generator.constWarning0;
        v_4246 = u_4246;
        term = log_0_2.instance.invoke(context, v_4246, s_4246, generator.const7111);
        if(term == null)
          break Fail25679;
        y_4246 = term;
        w_4246 = generator.constWarning0;
        z_4246 = y_4246;
        term = log_0_2.instance.invoke(context, z_4246, w_4246, generator.const7112);
        if(term == null)
          break Fail25679;
        c_4247 = term;
        a_4247 = generator.constWarning0;
        d_4247 = c_4247;
        term = log_0_2.instance.invoke(context, d_4247, a_4247, generator.const7113);
        if(term == null)
          break Fail25679;
        term = new_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25679;
        h_4247 = term;
        e_4247 = generator.constWarning0;
        i_4247 = h_4247;
        f_4247 = generator.const7114;
        term = i_4247;
        j_4247 = i_4247;
        term = log_0_3.instance.invoke(context, j_4247, e_4247, f_4247, term);
        if(term == null)
          break Fail25679;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}