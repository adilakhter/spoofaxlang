package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Declaration$File_0_0 extends Strategy 
{ 
  public static $Declaration$File_0_0 instance = new $Declaration$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DeclarationFile_0_0");
    Fail76266:
    { 
      TermReference f_92102 = new TermReference();
      TermReference g_92102 = new TermReference();
      IStrategoTerm k_92102 = null;
      if(g_92102.value == null)
        g_92102.value = term;
      else
        if(g_92102.value != term && !g_92102.value.match(term))
          break Fail76266;
      if(f_92102.value == null)
        f_92102.value = term;
      else
        if(f_92102.value != term && !f_92102.value.match(term))
          break Fail76266;
      k_92102 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, k_92102, trans.const15524, g_92102.value);
      if(term == null)
        break Fail76266;
      lifted21640 lifted216400 = new lifted21640();
      lifted216400.f_92102 = f_92102;
      lifted216400.g_92102 = g_92102;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted216400);
      if(term == null)
        break Fail76266;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}