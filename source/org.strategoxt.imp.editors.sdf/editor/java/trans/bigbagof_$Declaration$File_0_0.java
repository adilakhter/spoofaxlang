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

@SuppressWarnings("all") public class bigbagof_$Declaration$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Declaration$File_0_0 instance = new bigbagof_$Declaration$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_DeclarationFile_0_0");
    Fail76259:
    { 
      TermReference c_92101 = new TermReference();
      TermReference d_92101 = new TermReference();
      if(d_92101.value == null)
        d_92101.value = term;
      else
        if(d_92101.value != term && !d_92101.value.match(term))
          break Fail76259;
      if(c_92101.value == null)
        c_92101.value = term;
      else
        if(c_92101.value != term && !c_92101.value.match(term))
          break Fail76259;
      Success41845:
      { 
        Fail76260:
        { 
          IStrategoTerm h_92101 = null;
          h_92101 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_92101, trans.const15524, d_92101.value);
          if(term == null)
            break Fail76260;
          if(true)
            break Success41845;
        }
        term = trans.constNil11;
      }
      lifted21636 lifted216360 = new lifted21636();
      lifted216360.c_92101 = c_92101;
      lifted216360.d_92101 = d_92101;
      term = filter_1_0.instance.invoke(context, term, lifted216360);
      if(term == null)
        break Fail76259;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}