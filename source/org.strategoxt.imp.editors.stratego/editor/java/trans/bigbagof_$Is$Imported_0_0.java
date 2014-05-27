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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail23444:
    { 
      TermReference g_4840 = new TermReference();
      TermReference h_4840 = new TermReference();
      if(h_4840.value == null)
        h_4840.value = term;
      else
        if(h_4840.value != term && !h_4840.value.match(term))
          break Fail23444;
      if(g_4840.value == null)
        g_4840.value = term;
      else
        if(g_4840.value != term && !g_4840.value.match(term))
          break Fail23444;
      Success12591:
      { 
        Fail23445:
        { 
          IStrategoTerm l_4840 = null;
          l_4840 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, l_4840, trans.const4537, h_4840.value);
          if(term == null)
            break Fail23445;
          if(true)
            break Success12591;
        }
        term = trans.constNil4;
      }
      lifted6989 lifted69890 = new lifted6989();
      lifted69890.g_4840 = g_4840;
      lifted69890.h_4840 = h_4840;
      term = filter_1_0.instance.invoke(context, term, lifted69890);
      if(term == null)
        break Fail23444;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}