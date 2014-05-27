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

@SuppressWarnings("all") public class ensure_directory_0_0 extends Strategy 
{ 
  public static ensure_directory_0_0 instance = new ensure_directory_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ensure_directory_0_0");
    Fail25515:
    { 
      IStrategoTerm term10081 = term;
      Success10060:
      { 
        Fail25516:
        { 
          IStrategoTerm r_4228 = null;
          r_4228 = term;
          IStrategoTerm term10082 = term;
          Success10061:
          { 
            Fail25517:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25517;
              { 
                if(true)
                  break Fail25516;
                if(true)
                  break Success10061;
              }
            }
            term = term10082;
          }
          term = r_4228;
          { 
            term = debug_1_0.instance.invoke(context, term, lifted9069.instance);
            if(term == null)
              break Fail25515;
            if(true)
              break Success10060;
          }
        }
        term = term10081;
        IStrategoTerm term10083 = term;
        Success10062:
        { 
          Fail25518:
          { 
            IStrategoTerm s_4228 = null;
            s_4228 = term;
            IStrategoTerm term10084 = term;
            Success10063:
            { 
              Fail25519:
              { 
                term = filemode_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25519;
                term = isdir_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25519;
                { 
                  if(true)
                    break Fail25518;
                  if(true)
                    break Success10063;
                }
              }
              term = term10084;
            }
            term = s_4228;
            { 
              term = debug_1_0.instance.invoke(context, term, lifted9070.instance);
              if(term == null)
                break Fail25515;
              if(true)
                break Success10062;
            }
          }
          term = term10083;
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