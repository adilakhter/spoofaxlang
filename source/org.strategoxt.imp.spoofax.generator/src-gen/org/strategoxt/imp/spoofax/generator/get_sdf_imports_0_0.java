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

@SuppressWarnings("all") public class get_sdf_imports_0_0 extends Strategy 
{ 
  public static get_sdf_imports_0_0 instance = new get_sdf_imports_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_sdf_imports_0_0");
    Fail25492:
    { 
      TermReference l_4225 = new TermReference();
      IStrategoTerm term10061 = term;
      Success10051:
      { 
        Fail25493:
        { 
          IStrategoTerm m_4225 = null;
          IStrategoTerm n_4225 = null;
          m_4225 = term;
          term = get_module_name_from_asfix_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25493;
          if(l_4225.value == null)
            l_4225.value = term;
          else
            if(l_4225.value != term && !l_4225.value.match(term))
              break Fail25493;
          term = collect_2_0.instance.invoke(context, m_4225, lifted9037.instance, skip_non_imports_2_0.instance);
          if(term == null)
            break Fail25493;
          n_4225 = term;
          lifted9039 lifted90390 = new lifted9039();
          lifted90390.l_4225 = l_4225;
          term = map_1_0.instance.invoke(context, term, lifted90390);
          if(term == null)
            break Fail25493;
          term = n_4225;
          if(true)
            break Success10051;
        }
        term = debug_1_0.instance.invoke(context, term10061, lifted9040.instance);
        if(term == null)
          break Fail25492;
        if(true)
          break Fail25492;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}