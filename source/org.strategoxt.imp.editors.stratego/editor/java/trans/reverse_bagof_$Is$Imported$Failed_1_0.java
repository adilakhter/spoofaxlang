package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported$Failed_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported$Failed_1_0 instance = new reverse_bagof_$Is$Imported$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4880)
  { 
    context.push("reverse_bagof_IsImportedFailed_1_0");
    Fail23679:
    { 
      TermReference f_4880 = new TermReference();
      TermReference g_4880 = new TermReference();
      if(g_4880.value == null)
        g_4880.value = term;
      else
        if(g_4880.value != term && !g_4880.value.match(term))
          break Fail23679;
      if(f_4880.value == null)
        f_4880.value = term;
      else
        if(f_4880.value != term && !f_4880.value.match(term))
          break Fail23679;
      Success12672:
      { 
        Fail23680:
        { 
          IStrategoTerm l_4880 = null;
          l_4880 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4880, trans.const4576, g_4880.value);
          if(term == null)
            break Fail23680;
          if(true)
            break Success12672;
        }
        term = trans.constNil4;
      }
      lifted7072 lifted70720 = new lifted7072();
      lifted70720.f_4880 = f_4880;
      lifted70720.g_4880 = g_4880;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70720, i_4880);
      if(term == null)
        break Fail23679;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}