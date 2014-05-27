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

@SuppressWarnings("all") public class is_nonterm_generator_0_0 extends Strategy 
{ 
  public static is_nonterm_generator_0_0 instance = new is_nonterm_generator_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_nonterm_generator_0_0");
    Fail25647:
    { 
      IStrategoTerm term10159 = term;
      Success10125:
      { 
        Fail25648:
        { 
          term = is_list_symbol_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25648;
          if(true)
            break Success10125;
        }
        term = term10159;
        IStrategoTerm term10160 = term;
        Success10126:
        { 
          Fail25649:
          { 
            term = is_seq_symbol_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25649;
            if(true)
              break Success10126;
          }
          term = term10160;
          IStrategoTerm term10161 = term;
          Success10127:
          { 
            Fail25650:
            { 
              term = is_alt_symbol_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25650;
              if(true)
                break Success10127;
            }
            term = term10161;
            IStrategoTerm term10162 = term;
            Success10128:
            { 
              Fail25651:
              { 
                term = cf_1_0.instance.invoke(context, term, is_nonterm_generator_0_0.instance);
                if(term == null)
                  break Fail25651;
                if(true)
                  break Success10128;
              }
              term = term10162;
              IStrategoTerm term10163 = term;
              Success10129:
              { 
                Fail25652:
                { 
                  term = opt_1_0.instance.invoke(context, term, _Id.instance);
                  if(term == null)
                    break Fail25652;
                  if(true)
                    break Success10129;
                }
                term = varsym_1_0.instance.invoke(context, term10163, _Id.instance);
                if(term == null)
                  break Fail25647;
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}