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

@SuppressWarnings("all") public class bagof_$Declaration$File_0_0 extends Strategy 
{ 
  public static bagof_$Declaration$File_0_0 instance = new bagof_$Declaration$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_DeclarationFile_0_0");
    Fail76264:
    { 
      TermReference z_92101 = new TermReference();
      TermReference a_92102 = new TermReference();
      if(a_92102.value == null)
        a_92102.value = term;
      else
        if(a_92102.value != term && !a_92102.value.match(term))
          break Fail76264;
      if(z_92101.value == null)
        z_92101.value = term;
      else
        if(z_92101.value != term && !z_92101.value.match(term))
          break Fail76264;
      Success41847:
      { 
        Fail76265:
        { 
          IStrategoTerm e_92102 = null;
          e_92102 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_92102, trans.const15524, a_92102.value);
          if(term == null)
            break Fail76265;
          if(true)
            break Success41847;
        }
        term = trans.constNil11;
      }
      lifted21639 lifted216390 = new lifted21639();
      lifted216390.z_92101 = z_92101;
      lifted216390.a_92102 = a_92102;
      term = filter_1_0.instance.invoke(context, term, lifted216390);
      if(term == null)
        break Fail76264;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}