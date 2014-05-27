package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Current$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$File_1_0 instance = new reverse_bagof_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17585)
  { 
    context.push("reverse_bagof_CurrentFile_1_0");
    Fail87804:
    { 
      TermReference c_17585 = new TermReference();
      if(c_17585.value == null)
        c_17585.value = term;
      else
        if(c_17585.value != term && !c_17585.value.match(term))
          break Fail87804;
      Success47309:
      { 
        Fail87805:
        { 
          IStrategoTerm g_17585 = null;
          IStrategoTerm i_17585 = null;
          IStrategoTerm j_17585 = null;
          i_17585 = term;
          g_17585 = trans.const17872;
          j_17585 = i_17585;
          term = dr_lookup_rule_0_2.instance.invoke(context, j_17585, g_17585, trans.constCons8528);
          if(term == null)
            break Fail87805;
          if(true)
            break Success47309;
        }
        term = trans.constNil14;
      }
      lifted24785 lifted247850 = new lifted24785();
      lifted247850.c_17585 = c_17585;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted247850, e_17585);
      if(term == null)
        break Fail87804;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}