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

@SuppressWarnings("all") public class descriptor_pp_table_0_0 extends Strategy 
{ 
  public static descriptor_pp_table_0_0 instance = new descriptor_pp_table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("descriptor_pp_table_0_0");
    Fail25714:
    { 
      IStrategoTerm k_4251 = null;
      Success10163:
      { 
        Fail25715:
        { 
          term = $Descriptor$P$P$Table_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25715;
          if(true)
            break Success10163;
        }
        IStrategoTerm o_4251 = null;
        IStrategoTerm l_4251 = null;
        IStrategoTerm m_4251 = null;
        IStrategoTerm q_4251 = null;
        IStrategoTerm r_4251 = null;
        IStrategoTerm t_4251 = null;
        IStrategoTerm u_4251 = null;
        IStrategoTerm v_4251 = null;
        o_4251 = generator.constEditorServiceprettyPpAf;
        term = generator.constEditorServiceprettyPpAf;
        k_4251 = o_4251;
        l_4251 = term;
        term = k_4251;
        m_4251 = k_4251;
        t_4251 = term;
        q_4251 = generator.const7124;
        u_4251 = t_4251;
        r_4251 = generator.constCons4561;
        v_4251 = u_4251;
        term = termFactory.makeTuple(generator.const7125, m_4251);
        term = dr_set_rule_0_3.instance.invoke(context, v_4251, q_4251, r_4251, term);
        if(term == null)
          break Fail25714;
        term = l_4251;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}